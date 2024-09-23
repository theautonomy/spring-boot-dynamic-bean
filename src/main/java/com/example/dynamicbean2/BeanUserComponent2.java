package com.example.dynamicbean2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class BeanUserComponent2 {

    private final ServiceA serviceA;
    private final ServiceB serviceB;

    @Autowired
    public BeanUserComponent2(ServiceA serviceA, ServiceB serviceB) {
        this.serviceA = serviceA;
        this.serviceB = serviceB;
    }

    @PostConstruct
    public void useServices() {
        serviceA.serve();
        serviceB.serve();
    }
}
