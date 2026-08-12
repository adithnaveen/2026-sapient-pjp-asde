package com.naveen.specifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Vehicle {
    public String vehicleType;

    public Vehicle (String vehicleType){
        this.vehicleType = vehicleType;
    }

    public void move(){
        System.out.println("Vehicle " + vehicleType + " moving...");
    }

}

class FourWheeler extends Vehicle {

    public double tankCapacity;

    public FourWheeler(String vehicleType, double tankCapacity){
        super(vehicleType);
        this.tankCapacity = tankCapacity;
    }

}

class Car extends FourWheeler {

    public boolean hasAirCondition;

    public Car(String vehicleType, double tankCapacity, boolean hasAirCondition){
        super(vehicleType,tankCapacity);
        this.hasAirCondition = hasAirCondition;
    }

}

class BMW extends Car {
    public boolean hasPowerSteering;
    public int airBag;

    public BMW(String vehicleType, double tankCapacity, boolean hasAirCondition, boolean hasPowerSteering, int airBag){
        super(vehicleType,tankCapacity,hasAirCondition);
        this.hasPowerSteering = hasPowerSteering;
        this.airBag = airBag;
    }


}

class Toyota extends Car {

    public String musicSystem;

    public Toyota(String vehicleType, double tankCapacity, boolean hasAirCondition, String musicSystem){
        super(vehicleType,tankCapacity,hasAirCondition);
        this.musicSystem = musicSystem;
    }

}


class TwoWheeler extends Vehicle {

    public boolean hasSelfStart;

    public TwoWheeler(String vehicleType,boolean hasSelfStart){
        super(vehicleType);
        this.hasSelfStart = hasSelfStart;
    }

}

class SportsBike extends TwoWheeler {

    public double maxSpeed;

    public SportsBike(String vehicleType,boolean hasSelfStart, double maxSpeed){
        super(vehicleType, hasSelfStart);
        this.maxSpeed = maxSpeed;
    }
}

class ElectricBike extends TwoWheeler {

    public double maxRange;

    public ElectricBike(String vehicleType,boolean hasSelfStart, double maxRange){
        super(vehicleType, hasSelfStart);
        this.maxRange = maxRange;
    }
}

class Ather extends ElectricBike {

    public String colour;

    public Ather(String vehicleType,boolean hasSelfStart, double maxRange, String colour){
        super(vehicleType, hasSelfStart,maxRange);
        this.colour = colour;
    }
}

public class MyClassChaining {
    private static final Logger log = LoggerFactory.getLogger(MyClassChaining.class);

    public static void main(String[] args) {

        log.info("---- BMW -----");
        // Vehicle reference pointing to BMW object
        Vehicle v1 = new BMW("FourWheeler(BMW)",56,true,true,2);
        v1.move();

        log.info("----- TOYOTA -----");
        // Vehicle reference pointing to Toyota object
        Vehicle v2 = new Toyota("FourWheeler(Toyota)",66,true,"Sony");
        v2.move();

        log.info("----- Ather ------- ");
        // Vehicle reference pointing to SportsBike object
        Vehicle v3 = new Ather("Bike(Ather)", true, 220,"red");
        v3.move();

    }
}
