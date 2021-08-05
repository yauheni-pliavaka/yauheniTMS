package com.home;

import com.home.model.Car;
import com.home.model.Engine;
import com.home.model.FuelTank;
import com.home.service.*;

/*
 Напишите структуру классов и продемонстрируйте работу

 - Машина имеет двигатель, бензобак (реализуйте класс для каждой сущности).
 - Чтобы поехать, машину необходимо завести, т.е. включить двигатель.
 - Реализуйте методы включения машины, который в свою очередь включает её двигатель.
 - Реализуйте метод езды на машине (например просто печатаем на консоль, что машина поехала)
 - Если машина не заведена, ехать она не может.
 - Машину можно заглушить.
 - После каждой поездки считаем, что машина прошла фиксированное расстояние.
 - Реализовать возможность посмотреть, какое расстояние машина прошла за все время.
 - Чтобы создать машину, обязательно нужно иметь двигатель и бензобак.
 - Марка машины, год выпуска, пройденное расстояние - не обязательны при создании машины и могут быть выставлены потом.
 (необязательно задавать в конструкторе)
 - После создания поменять двигатель машине нельзя.
 - Чтобы машина завелась, у неё должно быть топливо в бензобаке, если топлива нет, машина не может завестись.
 - Машину можно дозаправить, можно проверить сколько топлива осталось.
 - Реализуйте пару полей для двигателя и бензобака, например: тип двигателя, общий объем бензобака,
 сколько бензина сейчас и т.д.
*/
public class Main {
    public static void main(String[] args) {
        FuelTank fuelTank = new FuelTank(100);
        Engine engine = new Engine("GAS");
        Car car = new Car(engine);
        car.setFuelTank(fuelTank);
        car.setBrand("Audi");
        car.setReleaseDate("2020");
        CarService carService = new CarServiceImpl(car);
        FuelTankService fuelTankService = new FuelTankServiceImpl(fuelTank);
        car.setCurrentDistance(100);

        carService.info();
        carService.start();
        carService.startEngine();
        carService.refueling(10);
        fuelTankService.showFuelLevel();
        carService.startEngine();
        carService.start();
        carService.stopEngine();
        carService.stop();
        carService.stopEngine();
        carService.showCurrentDistance();
        carService.start();
        carService.startEngine();
        carService.refueling(10);
        fuelTankService.showFuelLevel();
        carService.startEngine();
        carService.start();
        carService.stopEngine();
        carService.stop();
        carService.stopEngine();
        carService.showTotalDistance();

    }
}
