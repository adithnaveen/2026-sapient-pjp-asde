package com.naveen.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

// program to show working of multi level try catch block
public class ExceptionMultiLevelEx {
    private static final Logger log = LoggerFactory.getLogger(ExceptionMultiLevelEx.class);

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        try {
            log.info("Please Enter Name :");
            String name = br.readLine(); // 1. surround with try catch  / throws exception

            try {
                log.info("Enter Your Age : ");
                Integer age = Integer.parseInt(br.readLine());

                display(name, age);

            }catch(NumberFormatException nfe) {
                log.error("Error occurred while parsing {}", nfe.getMessage());
            }
        }catch(IOException ioe) {
            log.error("Buffered reader exception : {}", ioe.getMessage());

        } catch(Exception ex) {
            log.error("Some Exception occurred contact admin : {}", ex.getMessage());
        }finally {
           try{
               br.close();
           }catch(IOException ioe) {
                log.error("Sorry Couldnt close br : {}", ioe.getMessage());
           }
        }
    }

    private static void display(String name, Integer age) {
        log.info("Your Name is {}", name);
        log.info("Your Age is {}", age);
    }
}
