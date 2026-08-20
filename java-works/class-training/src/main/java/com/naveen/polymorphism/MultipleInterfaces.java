package com.naveen.polymorphism;

//
//class One {}
//class Two { }
//class Three extends One, Two { }

interface  One {
    public void first();
}
interface  Two {}
interface  Three extends  One, Two {} // correct in java
interface  Five {}
interface Four extends  Three, Five {}
interface  Six {}

class MyApp implements  Four, Six {
    @Override
    public void first() {
        System.out.println("One Overrride... ");
    }
}

public class MultipleInterfaces  {
}
