package com.home.service;

public interface CarService {
    void info();

    boolean isMoving();

    void refueling(int fuelQuantity);

    void start();

    void stop();

    void startEngine();

    void stopEngine();

    void showCurrentDistance();

    void showTotalDistance();
}
