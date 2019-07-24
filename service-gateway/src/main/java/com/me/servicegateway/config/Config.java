package com.me.servicegateway.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Mono;

import java.util.Objects;

/**
 * @author qun
 */
public class Config {

    /**
     *根据参数限流
     * @return k
     */
    @Bean
    KeyResolver useKeyResolver(){
        return exchange -> Mono.just(Objects.requireNonNull(exchange.getRequest().getQueryParams().getFirst("{name}")));
    }

    /**
     * ip限流
     * @return k
     */
    @Bean
    KeyResolver ipKeyResolver(){
        return exchange -> Mono.just(Objects.requireNonNull(exchange.getRequest().getRemoteAddress()).getHostName());
    }
}
