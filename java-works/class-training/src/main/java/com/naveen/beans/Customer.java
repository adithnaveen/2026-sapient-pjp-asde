package com.naveen.beans;

class Customer {
    private int custId;
    private double income;
    private Name name;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

// every class shall have default constructor by compiler at the time of compiling
    // if you have not created one


    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custFirstName='" + custFirstName + '\'' +
                ", custLastName='" + custLastName + '\'' +
                ", income=" + income +
                '}';
    }
}
