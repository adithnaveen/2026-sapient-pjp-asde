package com.naveen.beans;


// defn of bean
// a bean a class which has private variable
// public getters and setters

class Name {
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



