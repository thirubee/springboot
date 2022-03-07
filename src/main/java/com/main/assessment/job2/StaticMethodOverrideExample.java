package com.main.assessment.job2;

public class StaticMethodOverrideExample extends StaticAbstractTest {
  StaticMethodOverrideExample(){
    System.out.println("extended class");
  }


  static void sound() {
    System.out.println("BIRRRRRRRRRRRRRRRRR");
  }

  public static void main(String[] args) {
    StaticAbstractTest staticAbstractTest = new StaticMethodOverrideExample();
  //  StaticMethodOverrideExample staticMethodOverrideExample = new StaticMethodOverrideExample();
    //staticMethodOverrideExample.sound();
    staticAbstractTest.sound();
  }

  @Override
  void display() {
    System.out.println("Its overridden display method");
  }
}

abstract class StaticAbstractTest {

  StaticAbstractTest(){
    System.out.println("Default StaticAbstractTest");
  }

  static void sound() {
    System.out.println("Hirrrrrrrrrrr");
  }

  abstract void display();

}