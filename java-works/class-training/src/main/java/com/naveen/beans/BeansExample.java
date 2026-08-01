package com.naveen.beans;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
    public void setCustId(int custId) {
        this.custId = custId;
    }
    public void setCustFirstName (String custFirstName) {
        this.custFirstName  = custFirstName;
    }

    public void setCustLastName(String custLastName) {
        this.custLastName = custLastName;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    @Override
    public String toString() {
//        return super.toString();
        return this.custId +", " + this.custFirstName +", " +this.custLastName +", " + this.income;
    }
}

public class BeansExample {
    private static final Logger log = LoggerFactory.getLogger(BeansExample.class);

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setCustId(101);
        customer.setCustFirstName("Naveen");
        customer.setCustLastName("Kumar");
        customer.setIncome(1234);

        log.info("customer info {}", customer.toString());
        log.info("customer info {}", customer);
    }
}
