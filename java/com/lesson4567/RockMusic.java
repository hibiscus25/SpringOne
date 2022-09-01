package com.lesson4567;

import org.springframework.stereotype.Component;

//@Component
public class RockMusic implements Music{

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
