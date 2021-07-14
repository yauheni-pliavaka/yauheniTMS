package com.home.model;

public class Computer {
    private String cpu;
    private int ram;
    private int disk;
    private int resourceCycles;

    public Computer(String cpu, int ram, int disk, int resourceCycles) {
        this.cpu = cpu;
        this.ram = ram;
        this.disk = disk;
        this.resourceCycles = resourceCycles;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    public int getResourceCycles() {
        return resourceCycles;
    }

    public void setResourceCycles(int resourceCycles) {
        this.resourceCycles = resourceCycles;
    }

    public void info() {
        System.out.printf("Процессор %s RAM %d Диск %d Ресурс %d", cpu, ram, disk, resourceCycles);
    }

    public void on() {
        System.out.println("Turning on...");
//        checkAction();
    }

//    private boolean checkAction() {
//
//    }

    public void off() {
        System.out.println("Turning off...");

    }
}
