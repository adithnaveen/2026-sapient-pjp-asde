package com.naveen.polymorphism;

import java.util.Comparator;

// is only contracts
interface PaymentGateWay {
    public void charges(); // by default, it is abstract
    public default void instructions() {
        logs();
        System.out.println("Every time there is terms and condition.. ");
        logs();
    }

    private void logs() {
        System.out.println("Logging every action... ");
    }

    public static void publicAPI() {
        System.out.println("Your usage API to be publicly available with passwords");
    }
}

class Payment {

    private String paymentType;
    protected Payment(String paymentType) {
        this.paymentType = paymentType;
    }
     public void pay() {
        System.out.println("Payment Type " + this.paymentType);
    }
}

class PhonePe extends Payment implements  PaymentGateWay{
    public PhonePe(String paymentType) {
        super(paymentType);
    }
    @Override
    public void charges() {
        System.out.println("For PhonePe Charges are 1%");
    }
}
class GPay extends Payment implements  PaymentGateWay{

    public GPay(String paymentType) {
        super(paymentType);
    }
    @Override
    public void charges() {
        System.out.println("For GPay Charges are 1.5%");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Payment payment = new PhonePe("upi");
        payment.pay();
        ((PaymentGateWay)payment).charges();
        ((PaymentGateWay)payment).instructions();

        payment = new GPay("card");
        payment.pay();
        ((PaymentGateWay)payment).charges();
        ((PaymentGateWay)payment).instructions();


        PaymentGateWay.publicAPI();

    }
}
