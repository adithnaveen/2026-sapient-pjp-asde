package com.naveen.stringworks;

public class Formatting {
    public static void main(String[] args) {
        String name = "Vineeth";
        float salary = 33434;
        int value = 1122;

        System.out.println(salary);
        System.out.printf("Salary: %.2f%n", salary);
        System.out.printf("%20s%n", name);
        System.out.printf("%s%n", name);
        System.out.printf("%06d%n", value);
    }
}
