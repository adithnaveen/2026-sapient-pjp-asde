package com.naveen.beans;


class Customer {
    private int custId;
    private String custFirstName;
    private String custLastName;
    private double income;

// every class shall have default constructor by compiler at the time of compiling
    // if you have not created one

    // get - only read

    public int getCustId() {
        return this.custId;
    }

    public String getCustFirstName() {
        return this.custFirstName;
    }

    public String getCustLastName() {
        return this.custLastName;
    }
    public double getIncome () {
        return this.income;
    }
    // set - only write

}

public class BeansExample {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.
    }
}
