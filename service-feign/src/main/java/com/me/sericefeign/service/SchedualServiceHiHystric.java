package com.me.sericefeign.service;

import org.springframework.stereotype.Component;

/**
 * @author qun
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry," + name;
    }
}
