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

    public static void  fileIncomeTax(Data data) throws NameTooSmallException, SalaryTooLessException {
        if(data.name().length()<6) {
             throw new NameTooSmallException("Name : " + data.name());
        }
        if(data.salary()<20000) {
            throw new SalaryTooLessException("Salary is Low : " + data.salary());
        }
    }


}
