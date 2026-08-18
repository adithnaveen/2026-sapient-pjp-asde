package com.naveen.polymorphism;

class Vehicle {
    public void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends  Vehicle {
    public void move() {
        System.out.println("Car is moving");
    }
}

class Truck extends Vehicle {
    public void moving() {
        System.out.println("truck is moving"); // here polymorphic behaviour will not work
    }
}


public class RunTimePolymorphism {

    public static void show(Vehicle vehicle) {
        vehicle.move();
    }
    public static void main(String[] args) {
        Vehicle [] vehicles = new Vehicle[3];

        vehicles[0] = new Vehicle();
        vehicles[1] = new Car();
        vehicles[2] = new Truck();

        for(Vehicle vehicle : vehicles) {
            show(vehicle);
        }

    }
}
