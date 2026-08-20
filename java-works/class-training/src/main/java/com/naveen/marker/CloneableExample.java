package com.naveen.marker;


class MyCloneClass implements  Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object o = super.clone();
        return new MyCloneClass();
    }
}


public class CloneableExample {
    public static void main(String[] args) throws CloneNotSupportedException{
        MyCloneClass mcc = new MyCloneClass();
        System.out.println(mcc);

        MyCloneClass mcc1 = (MyCloneClass) mcc.clone();
        System.out.println(mcc1);
    }
}
