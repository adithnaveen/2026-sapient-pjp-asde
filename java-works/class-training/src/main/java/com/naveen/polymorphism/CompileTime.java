package com.naveen.polymorphism;

public class CompileTime {

    public static void display() {
        System.out.println("Display Called without any parameters");
    }
//
//    public static void display(String name) {
//        System.out.println("Display with String Name : " + name);
//    }

    public static void display(int value) {
        System.out.println("Display with Int Value " + value);
    }

    public static void display(String name, int value) {
        System.out.println("Display Name " + name +" value : " + value);
    }
//
//    public static void display(String carType, String [] cars) {
//        System.out.println("Car Type " + carType);
//
//        // or
//        for(String car : cars) {
//            System.out.println(car);
//        }
//    }


// the variable arguments can take array or any values, but if you use variable arguments then it should be the last one
    public static  void display(String carType, String ... cars ) {
        System.out.println("Car Type " + carType);

        // or
        for(String car : cars) {
            System.out.println(car);
        }
    }

    public static void display(String str1, String str2 ) {
        System.out.println("called with 2 string params " + str1 +", "+ str2);
    }

    public static void main(String[] args) {
        display();
        display("Vineeth");
        display(123);
        display("Vineeth", 333);

        display("suv", new String[]{"BMW X1", "Hyundai Creta", "Jeep Compasss"});
        display("suv");

        display("suv",  "BMW X3", "Hyundai Venue", "Volvo XC90" );
        display("suv",  "BMW X3");
    }
}
