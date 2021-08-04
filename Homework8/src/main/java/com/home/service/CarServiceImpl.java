package com.home.service;

import com.home.model.Car;
import com.home.model.FuelTank;

public class CarServiceImpl implements CarService {
    private final Car car;
    private final EngineService engineService;
    private final FuelTankService fuelTankService;

    public CarServiceImpl(Car car) {
        this.car = car;
        this.engineService = new EngineServiceImpl(car.getEngine());
        this.fuelTankService = new FuelTankServiceImpl(car.getFuelTank());
    }

    @Override
    public void info() {
        System.out.println(car);
    }

    @Override
    public boolean isMoving() {
        return car.isMoving();
    }

    @Override
    public void refueling(int fuelQuantity) {
        fuelTankService.refuel(fuelQuantity);
        System.out.println("Refueling...");
    }

    @Override
    public void start() {
        if (engineService.isRunning()) {
            car.setMoving(true);
            System.out.println("Car is moving now");
            car.setTotalDistance(car.getTotalDistance() + car.getCurrentDistance());
        } else {
            System.out.println("You can't start moving. Please, start your engine");
        }
    }

    @Override
    public void stop() {
        if (isMoving()) {
            car.setMoving(false);
            System.out.println("Car is stopping now");
        } else {
            System.out.println("Your car is stopping yet");
        }
    }

    @Override
    public void startEngine() {
        if (!fuelTankService.isEmpty()) {
            engineService.start();
        } else {
            System.out.println("You can't start engine. Your gas tank is empty");
        }
    }

    @Override
    public void stopEngine() {
        if (!isMoving()) {
            engineService.stop();
        } else {
            System.out.println("You can't stop engine. Please, stop your car");
        }
    }

    @Override
    public void showCurrentDistance() {
        System.out.println("Car drove " + car.getCurrentDistance() + " km");
    }

    @Override
    public void showTotalDistance() {
        System.out.println("Total distance: " + car.getTotalDistance() + " km");
    }
}
