package com.my131.demo_di.controller;

import com.my131.demo_di.service.DemoService.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DemoController {
    private final DemoService demoService;

    @Autowired
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    public void handleRequest() {
        demoService.doSomething();
    }
}
