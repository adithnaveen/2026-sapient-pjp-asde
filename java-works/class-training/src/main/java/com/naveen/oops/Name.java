package com.naveen.oops;
// since this is a bean class we can call this as record from java 16
// this will help us to reduce the boiler plate code of getters and setters, to string etc
// since it is immutable you have to pass arguments at the time of construction
// so ideally there will not be a setter
public record Name (String fName, String lName) {

}
