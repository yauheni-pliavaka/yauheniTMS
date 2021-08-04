package com.home.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;
import java.util.Scanner;

@Getter
@Setter
@ToString
public class Computer {
    private String cpu;
    private int ram;
    private int disk;
    private int resourceCycles;
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);
    private boolean burned;

    public Computer(String cpu, int ram, int disk, int resourceCycles) {
        this.cpu = cpu;
        this.ram = ram;
        this.disk = disk;
        this.resourceCycles = resourceCycles;
    }


    public void info() {
        System.out.printf("CPU: %s RAM: %d DISK: %d RESOURCE: %d\n", cpu, ram, disk, resourceCycles);
    }

    public void on() {
        if (!isBurned()) {
            System.out.println("Turning on...");
            if (checkAction() && checkResourceCycles()) {
                System.out.println("Computer is turn on");
                off();
            } else {
                burned();
            }
        } else {
            burned();
        }
    }

    private void burned() {
        System.out.println("Computer was BURNED!");
        burned = true;
    }

    private boolean checkAction() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int value = -1;
        do {
            System.out.println("Please, enter 0 or 1");
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
            } else {
                System.out.println("Incorrect data");
                scanner.next();  //чтобы не попасть в вечный цикл
            }
        } while (!(value == 0 || value == 1));
        return random.nextInt(2) == value;
    }

    public void off() {
        resourceCycles--;
        System.out.println("Turning off...");
        if (!isBurned()) {
            System.out.println("Computer is turn off");
            System.out.println("Count of remaining cycles: " + resourceCycles);
            on();
        } else {
            burned();
        }
    }

    private boolean checkResourceCycles() {
        return resourceCycles > 0;
    }
}
