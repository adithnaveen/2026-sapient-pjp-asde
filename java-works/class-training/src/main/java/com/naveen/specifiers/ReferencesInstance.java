package com.naveen.specifiers;

public class ReferencesInstance {
    public static void main(String[] args) {
        String s1 = new String("India"); // s1 shall be elegible for gc
        System.out.println("S1 is " + s1);
        String s2 = s1;
        System.out.println("S2 is " + s2);

        s1 = s1.toUpperCase();

        System.out.println("S1 is " + s1);
        System.out.println("S2 is " + s2);

        s2 = "I'm in India";
        System.out.println("S2 is " + s2);


        String [] myStrings = new String[10]; // this is reference
        myStrings[0] = new String("Bharath"); // object instantiation
        myStrings[1] = new String("Aniketh");
        myStrings[2] = new String("Meet");


    }
}
