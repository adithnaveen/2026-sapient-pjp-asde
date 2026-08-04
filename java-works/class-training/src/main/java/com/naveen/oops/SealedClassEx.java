package com.naveen.oops;


sealed class Device1 permits Monitor1, Projector1 {

}

final class  Monitor1 extends  Device1{}
final class Projector1 extends  Device1{ }



//class Human extends Device1 {}

public class SealedClassEx {
}
