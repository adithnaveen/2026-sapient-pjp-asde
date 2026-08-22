package com.naveen.exception;

// if the class extends Exception class then it is eligible to be throwable
public class NameTooSmallException extends  Exception{
    private String detailedMessage;

    public NameTooSmallException(){
        this.detailedMessage = "Name Too Small";
    }

    public NameTooSmallException(String detailedMessage) {
        this.detailedMessage = detailedMessage;
    }

    @Override
    public String toString() {
        return "NameTooSmallException{" +
                "detailedMessage='" + detailedMessage + '\'' +
                '}';
    }

    @Override
    public String getMessage() {
        return "from getMessage: " + this.detailedMessage;
    }
}
