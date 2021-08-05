package com.home.service;

import com.home.model.Engine;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EngineServiceImpl implements EngineService {
    private final Engine engine;
    @Override
    public void start() {
        if (!isRunning()) {
            System.out.println("Engine was started");
            this.engine.setRunning(true);
        } else {
            System.out.println("Engine is running yet");
        }
    }

    @Override
    public void stop() {
        if (isRunning()) {
            System.out.println("Engine was stopped");
            engine.setRunning(false);
        } else {
            System.out.println("Engine is stopped yet");
        }
    }

    @Override
    public boolean isRunning() {
        return engine.isRunning();
    }
}
