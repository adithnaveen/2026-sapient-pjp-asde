package com.naveen.oops;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class SwitchExample {
    private static final Logger log = LoggerFactory.getLogger(SwitchExample.class);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        log.info("Enter Your Name : ");
        String name = sc.nextLine();

        log.info("Enter Your Age : ");
        int  age = Integer.parseInt(sc.nextLine());

        log.info("Enter Designation ");
        String designation = sc.nextLine();

        log.info("Name {} ", name);
        log.info("Age {} ", age);
        log.info("Designation {} ", designation);

        String nextPosition = switch (designation) {
            case "Engineer" ->   "Tech Person";
            case "Manager" ->   "Growing  Leader";
            case "Director" ->   "Leadership Person";
            default -> "Not Matching Any Case";
        };

        log.info("Next Position {} ", nextPosition);
 // seeding to github
    }
}
