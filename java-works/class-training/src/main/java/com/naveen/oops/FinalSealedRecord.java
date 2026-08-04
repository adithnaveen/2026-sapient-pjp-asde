package com.naveen.oops;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// if the class is declared as final it cannot be inherited
//class final Shape {}
//class Circle extends  Shape {}




abstract class Device {
    private static final Logger log = LoggerFactory.getLogger(Device.class);

    abstract void on();
    abstract void off();
}

class Monitor extends Device {
    private static final Logger log = LoggerFactory.getLogger(Monitor.class);

    void on(){log.info(("in Monitor On"));}
    void off(){log.info("in Monitor Off");}
    void resolution() {log.info("the resolution is 1200x1080");}
}

class Projector extends  Device {
    private static final Logger log = LoggerFactory.getLogger(Projector.class);

    void on(){log.info(("in Projector On"));}
    void off(){log.info("in Projector Off");}
}

public class FinalSealedRecord {
    private static void work(Device d ) {
        // if you want to down cast, then type casting of the class is mandatory
        if(d instanceof  Monitor) {
            ((Monitor) d).resolution();
        }


        // the super class can always hold ref of subclass without casting
        d.on();
        d.off();

    }
    public static void main(String[] args) {
          final Logger log = LoggerFactory.getLogger(Projector.class);

        // if the class is abstract then you cannot instantiate
//        Device d1 = new Device();

        // version 1
//       Device d = new Monitor();
//        work(d);
//
//       d = new Projector();
//       work(d);


        // version 2  - create multiple monitor and projectors

        Device[] devices = new Device[4];

        devices[0] = new Monitor();
        devices[1] = new Projector();
        devices[2] = new Monitor();
        devices[3] = new Projector();

//        for(int i =0; i<devices.length; i++) {
//            work(devices[i]);
//            log.info("--------------------");
//        }

            for(Device device : devices) {
                work(device);
                log.info("--------------------");
            }


            // working with records

        Name name = new Name("Naveen", "Kumar");
        log.info("FName " + name.fName() +", LName " + name.lName());
    }
}
