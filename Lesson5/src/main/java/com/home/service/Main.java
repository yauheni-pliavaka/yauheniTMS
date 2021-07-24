package com.home.service;

import com.home.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("CPU1", 16, 256, 5);

//        computer.setCpu("CPU2");
//        computer.setRam(32);
//        computer.setDisk(1024);
//        computer.setResourceCycles(5);

        computer.info();
    }
}
