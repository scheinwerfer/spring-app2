package com.skachinsky;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "50 cent - Candy Shop";
    }
}
