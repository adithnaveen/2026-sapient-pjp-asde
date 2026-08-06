package com.naveen.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class ExceptionEx1 {
    private static final Logger log = LoggerFactory.getLogger(ExceptionEx1.class);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
        log.info("Enter First Number : ");
        int num1 = Integer.parseInt(sc.nextLine());

        log.info("Enter Second Number : ");
        int num2 = Integer.parseInt(sc.nextLine());

            int result = num1 / num2;
            System.out.println("Result " + result);

            // exception should be at last
        }catch(ArithmeticException ae) {
            log.info("Arithmetic Exception occurred due to  {0}", ae);
        } catch (NumberFormatException nfe) {
            log.info("Number Format Exception occurred due to  {0}", nfe);
        }catch (Exception e) {
            System.out.println("There is a error " + e.getMessage());
        }

        System.out.println("This is after result ");
    }
}
