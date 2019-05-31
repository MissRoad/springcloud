package com.me.sericefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 定义一个feign接口，通过@ FeignClient（“服务名”），来指定调用哪个服务。比如在代码中调用了service-hi服务的“/hi”接口，
 *
 * @author qun
 */
@FeignClient(value = "service-hi")
public interface SchedualServiceHi {
    /**
     * 调用其他服务
     *
     * @param name
     * @return
     */
    @GetMapping(value = "/hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
