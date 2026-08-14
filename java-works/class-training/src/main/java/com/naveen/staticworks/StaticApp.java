package com.naveen.staticworks;

class Account {

    private int accNo;
    private String name;
    private int aadharCard;
    private String panCard;

    static int count=100;

    public Account(String name, int aadharCard, String panCard) {
        this.accNo = count ++;
        this.name = name;
        this.aadharCard = aadharCard;
        this.panCard = panCard;
    }

    public int getAccNo() {
        return accNo;
    }

    private void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAadharCard() {
        return aadharCard;
    }

    private void setAadharCard(int aadharCard) {
        this.aadharCard = aadharCard;
    }

    public String getPanCard() {
        return panCard;
    }

    private void setPanCard(String panCard) {
        this.panCard = panCard;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNo=" + accNo +
                ", name='" + name + '\'' +
                ", aadharCard=" + aadharCard +
                ", panCard='" + panCard + '\'' +
                '}';
    }
}


public class StaticApp {
    public static void main(String[] args) {
        System.out.println("Count value is " + Account.count);

        Account account1 = new Account("Ansh", 23456, "ASBC12345GF");
        System.out.println(account1);

        Account account2 = new Account("Vineeth", 55667, "AHHH3434B");
        System.out.println(account2);

        Account account3 = new Account("Aniket", 232323, "KKJP79890F");
        System.out.println(account3);
    }
}
