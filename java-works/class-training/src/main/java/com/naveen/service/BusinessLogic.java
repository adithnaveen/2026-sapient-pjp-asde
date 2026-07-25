package com.naveen.service;

public class BusinessLogic {

    public int add(int num1, int num2)  {
        return num1 + num2;
    }

    public String greeting(String name, double salary ) {
        return salary <1000?"low" : salary >1000 && salary<10000 ?"med" : "high";
    }
}
