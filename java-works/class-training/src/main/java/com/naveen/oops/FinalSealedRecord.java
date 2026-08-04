package com.naveen.oops;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Device {
    private static final Logger log = LoggerFactory.getLogger(Device.class);

    void on(){log.info(("in Device On"));}
    void off(){log.info("in Device Off");}
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

        if(d instanceof  Monitor) {
            ((Monitor) d).resolution();
        }
        d.on();
        d.off();

    }
    public static void main(String[] args) {
       Device d = new Monitor();
      work(d);

       d = new Projector();
       work(d);
    }
}
