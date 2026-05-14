package com.education.ztu;

public class Car {
    private String brand;
    private Engine engine;

    public Car(String brand) {
        this.brand = brand;
        this.engine = new Engine();
    }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public void startCar() {
        engine.startEngine();
    }

    public void stopCar() {
        engine.stopEngine();
    }

    public boolean isCarRunning() {
        return engine.isEngineWorks();
    }

    // Внутрішній клас Engine
    public class Engine {
        private boolean engineWorks = false;

        public void startEngine() {
            engineWorks = true;
            System.out.println(brand + " engine started");
        }

        public void stopEngine() {
            engineWorks = false;
            System.out.println(brand + " engine stopped");
        }

        public boolean isEngineWorks() {
            return engineWorks;
        }
    }
}