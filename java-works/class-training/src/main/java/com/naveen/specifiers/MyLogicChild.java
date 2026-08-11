package com.naveen.specifiers;

public class MyLogicChild extends  MyLogic {

    // lets see which variables are accessed

    public void myMethod()  {
        super.proInt = 111;
        super.myInt= 222;
        super.pubInt = 333;
//        super.priInt = 444;
    }

}
