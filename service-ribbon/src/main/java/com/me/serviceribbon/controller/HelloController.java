package com.me.serviceribbon.controller;

import com.me.serviceribbon.service.HellowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qun
 */
@RestController
public class HelloController {

    @Autowired
    HellowService service;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return service.hiService(name);
    }
}
