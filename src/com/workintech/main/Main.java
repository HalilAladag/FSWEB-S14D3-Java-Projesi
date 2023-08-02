package com.workintech.main;

import com.workintech.model.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Car ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Car holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        GasPoweredCar gasCar = new GasPoweredCar("Gas Car", "Gas car description", 12.5, 4);
        ElectricCar electricCar = new ElectricCar("Electric Car", "Electric car description", 150.0, 85);
        HybridCar hybridCar = new HybridCar("Hybrid Car", "Hybrid car description", 8.5, 60, 4);

        System.out.println(gasCar.startEngine());
        System.out.println(gasCar.drive());

        System.out.println(electricCar.startEngine());
        System.out.println(electricCar.drive());

        System.out.println(hybridCar.startEngine());
        System.out.println(hybridCar.drive());
    }
}
