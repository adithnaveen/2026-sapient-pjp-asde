package com.naveen.specifiers;

public class MyLogic1 {

    public void myWork(){
        // if the class is not inheritec then
        // instacn of the object has to be created
        MyLogic ml = new MyLogic();
        ml.myInt = 222;
        ml.proInt = 333;
        ml.pubInt = 444;
        // private variables are not accessed outside the class
//        ml.priInt = 555;
    }

}
