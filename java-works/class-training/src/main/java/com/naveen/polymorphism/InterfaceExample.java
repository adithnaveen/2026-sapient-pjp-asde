package com.naveen.polymorphism;

// is only contracts
interface PaymentGateWay {
    public void charges(String paymentType);
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
    public void charges(String paymentType) {
        System.out.println("For PhonePe Charges are 1%");
    }
}
class GPay extends Payment implements  PaymentGateWay{

    public GPay(String paymentType) {
        super(paymentType);
    }
    @Override
    public void charges(String paymentType) {
        System.out.println("For GPay Charges are 1.5%");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Payment payment = new PhonePe("upi");
        payment.pay();
        ((PaymentGateWay)payment).charges();

    }
}
