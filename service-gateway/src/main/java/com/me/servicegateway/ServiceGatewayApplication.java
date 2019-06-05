package com.me.servicegateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @author qun
 */
@SpringBootApplication
public class ServiceGatewayApplication {

    public static ConfigurableApplicationContext context;

    public static void main(String[] args) {
        context = SpringApplication.run(ServiceGatewayApplication.class, args);
    }

//    @Bean
//    RouteLocatorBuilder builder() {
//        return new RouteLocatorBuilder(context);
//    }

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes().route("path_route",
                r -> r.path("/tool").uri("http://freezone.fun")

        ).build();
    }

}
