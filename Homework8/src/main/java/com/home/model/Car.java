package com.home.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Car {
    private String brand;
    private String releaseDate;
    private final Engine engine;
    private FuelTank fuelTank;
    private FuelTank fuelLevel;
    private boolean isMoving;
    private int currentDistance;
    private int totalDistance;


    public Car(Engine engine) {
        this.engine = engine;
    }
}
