package com.naveen.beans;


// defn of bean
// a bean a class which has private variable
// public getters and setters


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
