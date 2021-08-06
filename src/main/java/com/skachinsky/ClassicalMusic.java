package com.skachinsky;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void init() {
        System.out.println("инициализация");
    }

    public void destroy() {
        System.out.println("уничтожение");
    }

    @Override
    public String getSong() {
        return "Bohemian Rhapsody";
    }
}
