package com.naveen.exception;

// if the class extends Exception class then it is elegible to be throwable
public class SalaryTooLessException extends  Exception{
    private String detailedMessage;

    public SalaryTooLessException(){
        this.detailedMessage = "Name Too Small";
    }

    public SalaryTooLessException(String detailedMessage) {
        this.detailedMessage = detailedMessage;
    }

    @Override
    public String toString() {
        return "SalaryTooLessException{" +
                "detailedMessage='" + detailedMessage + '\'' + '}';
    }
}
