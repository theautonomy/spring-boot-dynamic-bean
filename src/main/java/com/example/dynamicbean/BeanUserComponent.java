package com.example.dynamicbean;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class BeanUserComponent {

    private final CustomService customService;

    public BeanUserComponent(CustomService customService) {
        this.customService = customService;
    }

    @PostConstruct
    public void useCustomService() {
        customService.doSomething();
    }
}
