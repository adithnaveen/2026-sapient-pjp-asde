package com.naveen.specifiers;


class First {
    private String name;

    public First(String name) {
        super(); // this statement shall be implicitly kept by compiler if not found - Object
        this.name = name;
    }
}
class Second extends  First {
    private double salary;
    public Second(String name, double salary) {
        super(name);
        this.salary = salary;
    }
}
class Third extends  Second {
    public Third(String name, double salary) {
        super(name, salary);
    }
}

public class ClassChaining {
    public static void main(String[] args) {


    }
}
