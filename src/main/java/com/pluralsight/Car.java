package com.pluralsight;

public class Car extends Vehicle {

    public Car(String name, String brand, String color, int numberOfPassengers,
                 double fuelCapacity, double cargoCapacity, double maxSpeed,
                 String driver, String vin) {
        super(name, brand, color, numberOfPassengers, fuelCapacity,
                cargoCapacity, maxSpeed, driver, vin);
    }

}
