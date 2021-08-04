package com.home.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FuelTank {
    private final int fuelTankVolume;
    private int fuelLevel;

    public FuelTank(int fuelTankVolume) {
        this.fuelTankVolume = fuelTankVolume;
    }
}
