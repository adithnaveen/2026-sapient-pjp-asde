package com.naveen.staticworks;


import com.naveen.staticworks.BusinesLogic.InnerClass;

class BusinesLogic {
    String myVar;

    public BusinesLogic(String myVar) {
        this.myVar = myVar;
    }

    // you cannot create an instance of inner class directly you should always support from outer class
    static class InnerClass {
        String myInnerVariable;
        public InnerClass(String myInnerVariable) {
            this.myInnerVariable = myInnerVariable;
        }

        public void display() {
            System.out.println("Inner Variable Value : " + this.myInnerVariable);
        }
    }
    public void display() {
        System.out.println("Var Value " + this.myVar);
    }
}

public class InnerExample {

    public static void main(String[] args) {
        BusinesLogic bl1 = new BusinesLogic("Business Logic");
//        InnerClass bi1 = bl1.new InnerClass("my inner variable");
        InnerClass bi1 = new InnerClass("my inner variable");
        bl1.display();
        bi1.display();

    }
}
