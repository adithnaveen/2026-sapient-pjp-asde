package com.naveen.staticworks;

public class StaticApp2 {
    static int myVar1;

    static {
        myVar1 = 1234;
        System.out.println(" i'm first static block ");
    }
    static {
        System.out.println(" i'm second  static block ");
    }
    public static void main(String[] args) {
        System.out.println(Utils.add(10,20));
        System.out.println(Utils.sub(33,2));

        System.out.println("variable value " + myVar1);
    }
    static {
        System.out.println(" i'm third static block ");
    }
}
