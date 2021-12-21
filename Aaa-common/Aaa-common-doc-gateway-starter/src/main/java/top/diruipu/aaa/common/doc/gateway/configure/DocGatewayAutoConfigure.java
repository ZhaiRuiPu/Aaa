package top.diruipu.aaa.common.doc.gateway.configure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.gateway.config.GatewayProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger.web.SecurityConfiguration;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;
import springfox.documentation.swagger.web.UiConfiguration;
import top.diruipu.aaa.common.doc.gateway.filter.DocGatewayHeaderFilter;
import top.diruipu.aaa.common.doc.gateway.handler.DocGatewayHandler;
import top.diruipu.aaa.common.doc.gateway.properties.DocGatewayProperties;

/**
 * @author diruipu
 * @create 2021-12-21 8:37 PM
 * @ClassName DocGatewayAutoConfigure
 */
@Configuration
@EnableConfigurationProperties(DocGatewayProperties.class)
@ConditionalOnProperty(value = "aaa.doc.gateway.enable", havingValue = "true", matchIfMissing = true)
public class DocGatewayAutoConfigure {

    private final DocGatewayProperties docGatewayProperties;
    private SecurityConfiguration securityConfiguration;
    private UiConfiguration uiConfiguration;

    public DocGatewayAutoConfigure(DocGatewayProperties docGatewayProperties) {
        this.docGatewayProperties = docGatewayProperties;
    }

    @Autowired(required = false)
    public void setSecurityConfiguration(SecurityConfiguration securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
    }

    @Autowired(required = false)
    public void setUiConfiguration(UiConfiguration uiConfiguration) {
        this.uiConfiguration = uiConfiguration;
    }

    @Bean
    public DocGatewayResourceConfigure docGatewayResourceConfigure(RouteLocator routeLocator, GatewayProperties gatewayProperties) {
        return new DocGatewayResourceConfigure(routeLocator, gatewayProperties);
    }

    @Bean
    public DocGatewayHeaderFilter docGatewayHeaderFilter() {
        return new DocGatewayHeaderFilter();
    }

    @Bean
    public DocGatewayHandler DocGatewayHandler(SwaggerResourcesProvider swaggerResources) {
        DocGatewayHandler docGatewayHandler = new DocGatewayHandler();
        docGatewayHandler.setSecurityConfiguration(securityConfiguration);
        docGatewayHandler.setUiConfiguration(uiConfiguration);
        docGatewayHandler.setSwaggerResources(swaggerResources);
        docGatewayHandler.setProperties(docGatewayProperties);
        return docGatewayHandler;
    }
}
