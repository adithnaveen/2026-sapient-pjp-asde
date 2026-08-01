package com.naveen.beans;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// defn of bean
// a bean a class which has private variable
// public getters and setters

class Name  {
    private String firstName;
    private String midName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", midName='" + midName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}



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

class Employee  {
    private int empId;
    private  Name name;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name=" + name +
                '}';
    }
}


public class BeansExample {
    private static final Logger log = LoggerFactory.getLogger(BeansExample.class);

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setCustId(101);
        Name name = new Name();

        name.setFirstName("Naveen");
        name.setMidName("Kumar");
        name.setLastName("Srinivas");

        customer.setName(name);
        customer.setIncome(1234);

        Employee employee = new Employee();
        employee.setEmpId(101);
        Name name1 = new Name();

        name1.setFirstName("Harish");
        name1.setMidName("Kumar");
        name1.setLastName("Vishal");

        employee.setName(name);
        log.info("customer info {}", customer.toString());
        log.info("customer info {}", customer);
    }
}
