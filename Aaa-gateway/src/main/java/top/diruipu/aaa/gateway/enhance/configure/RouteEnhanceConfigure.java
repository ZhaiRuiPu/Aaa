package top.diruipu.aaa.gateway.enhance.configure;


import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import top.diruipu.aaa.common.core.constant.SystemConstant;
import top.diruipu.aaa.gateway.enhance.runner.RouteEnhanceRunner;
import top.diruipu.aaa.gateway.enhance.service.BlackListService;
import top.diruipu.aaa.gateway.enhance.service.RateLimitRuleService;
import top.diruipu.aaa.gateway.enhance.service.RouteEnhanceCacheService;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author MrBird
 */
@EnableAsync
@Configuration
@EnableReactiveMongoRepositories(basePackages = "top.diruipu.aaa.gateway.enhance.mapper")
@ConditionalOnProperty(name = "febs.gateway.enhance", havingValue = "true")
public class RouteEnhanceConfigure {

    @Bean(SystemConstant.ASYNC_POOL)
    public ThreadPoolTaskExecutor asyncThreadPoolTaskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(5);
        executor.setMaxPoolSize(20);
        executor.setQueueCapacity(100);
        executor.setKeepAliveSeconds(30);
        executor.setThreadNamePrefix("Febs-Gateway-Async-Thread");
        executor.setWaitForTasksToCompleteOnShutdown(true);
        executor.setAwaitTerminationSeconds(60);
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executor.initialize();
        return executor;
    }

    @Bean
    public ApplicationRunner routeEnhanceRunner(RouteEnhanceCacheService cacheService,
                                                    BlackListService blackListService,
                                                    RateLimitRuleService rateLimitRuleService) {
        return new RouteEnhanceRunner(cacheService, blackListService, rateLimitRuleService);
    }
}
