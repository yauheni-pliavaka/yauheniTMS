package com.home.service;

public interface FuelTankService {
    boolean isEmpty();

    void refuel(int fuelQantity);

    void showFuelLevel();
}
