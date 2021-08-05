package com.home.service;

import com.home.model.FuelTank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class FuelTankServiceImpl implements FuelTankService {
    private FuelTank fuelTank;

    @Override
    public boolean isEmpty() {
        return fuelTank.getFuelLevel() == 0; //если 0 возвращает true
    }

    @Override
    public void refuel(int fuelQuantity) {
        fuelTank.setFuelLevel(fuelQuantity + fuelTank.getFuelLevel());
    }

    @Override
    public void showFuelLevel() {
        System.out.println("Current fuel level is " + fuelTank.getFuelLevel() + " liters");
    }
}
