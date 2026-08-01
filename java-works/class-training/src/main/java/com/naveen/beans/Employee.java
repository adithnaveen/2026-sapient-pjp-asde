package com.naveen.beans;


// defn of bean
// a bean a class which has private variable
// public getters and setters


class Employee {
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


