package com.naveen.staticworks;

import java.util.HashMap;
import java.util.Map;

public class VarExample {
    public static void main(String[] args) {
        var myInt = 12345; // inferred as int  type
        var country =  "India"; // inferred as String type
        var map = new HashMap<>();

        int var = 333; // dont practice this

        System.out.println(myInt);
        System.out.println(country);

    }
}
