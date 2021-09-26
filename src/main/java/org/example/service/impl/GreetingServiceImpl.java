package org.example.service.impl;

import org.example.service.GreetingService;
import org.springframework.stereotype.Component;

@Component
public class GreetingServiceImpl implements GreetingService {


    @Override
    public String getGreeting() {
        return "Hi";
    }
}
