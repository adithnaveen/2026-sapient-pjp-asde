package com.naveen.exception;

public class ExceptionEx1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        try {
            int result = num1 / num2;
            System.out.println("Result " + result);
        }catch(Exception e) {
            System.out.println("There is a error " + e.getMessage());
        }

        System.out.println("This is after result ");
    }
}
