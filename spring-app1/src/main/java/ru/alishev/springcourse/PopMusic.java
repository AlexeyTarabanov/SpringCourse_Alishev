package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

public class PopMusic implements Music {
    @Override
    public String getSong() {
        return "Billie Jean";
    }
}
