package top.diruipu.aaa.gateway.common.runner;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import top.diruipu.aaa.common.core.util.SystemUtil;

/**
 * @author diruipu
 * @create 2021-12-21 6:29 PM
 * @ClassName StartedUpRunner
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class StartedUpRunner implements ApplicationRunner {

    private final ConfigurableApplicationContext context;
    private final Environment environment;

    @Override
    public void run(ApplicationArguments args) {
        if (context.isActive()) {
            SystemUtil.printSystemUpBanner(environment);
        }
    }
}
