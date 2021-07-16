package com.spring.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World -Setter";
    }
}
