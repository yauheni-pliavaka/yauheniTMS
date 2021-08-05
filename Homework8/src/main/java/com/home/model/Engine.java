package com.home.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Engine {
    private final String engineType;
    private boolean isRunning;

    public Engine(String engineType) {
        this.engineType = engineType;
    }
}
