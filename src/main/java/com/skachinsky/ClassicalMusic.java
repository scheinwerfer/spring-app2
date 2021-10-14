package com.skachinsky;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music {
    @PostConstruct
    public void init() {
        System.out.println("инициализация");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("уничтожение");
    }

    @Override
    public String getSong() {
        return "Bohemian Rhapsody";
    }
}
