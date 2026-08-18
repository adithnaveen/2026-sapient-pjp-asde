package com.naveen.polymorphism;

// pure abstract class
abstract class Vehicle {
    public abstract void move();
}

// partial implemneted class
abstract class Car extends Vehicle {
    public void honk() {
        System.out.println("car shall have honk");
    }
}
// this class is called as concrete class
class Maruti extends  Car {
    public void move() {
        System.out.println("Maruti car is moving");
    }
}

class Truck extends Vehicle {
    public void move() {
        System.out.println("truck is moving"); // here polymorphic behaviour will not work

    }
}


public class RunTimePolymorphism {

    public static void show(Vehicle vehicle) {
        vehicle.move();

        if(vehicle instanceof Car) {
            ((Car) vehicle ).honk();
        }
    }
    public static void main(String[] args) {
        Vehicle [] vehicles = new Vehicle[3];

        vehicles[0] = new Maruti();
        vehicles[2] = new Maruti();
        vehicles[1] = new Truck();

        for(Vehicle vehicle : vehicles) {
            show(vehicle);
        }

    }
}
