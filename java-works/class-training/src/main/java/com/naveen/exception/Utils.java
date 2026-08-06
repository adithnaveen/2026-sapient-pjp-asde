package com.naveen.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Utils {


    private static final Logger log = LoggerFactory.getLogger(Utils.class);

    public static Data acceptData() {

        Scanner sc = new Scanner(System.in);
        log.info("Enter Your Name : ");
        String name = sc.nextLine();

        log.info("Enter Your Salary ");
        double salary = Double.parseDouble(sc.nextLine());

        log.info("Enter Company Name ");
        String compName = sc.nextLine();

        return  new Data(name, salary, compName);

    }

    public static void  fileIncomeTax(Data data) throws NameTooSmallException {
        if(data.name().length()<6) {
             throw new NameTooSmallException("Name : " + data.name());
        }

        // condition
        // if the salary is less than 20000 - throw exception with message too less salary not eligible to file
        // if salary more than 20000 and less than 50000 you will have full reimbursement in 26as- processes ITR
        // more than 50000 and less than 100000 then 20% slab-processes ITR
        // all other cases 35% ITR  - processes ITR
    }


}
