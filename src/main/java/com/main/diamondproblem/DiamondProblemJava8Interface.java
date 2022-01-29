package com.main.diamondproblem;

public class DiamondProblemJava8Interface implements I1,I2 {

  @Override
  public void disp() {
   I1.super.disp();
  }

}
interface I1{
  default void disp(){
    System.out.println("I'm from I1");
  }
}

interface I2{
  default void disp(){
    System.out.println("I'm from I2");
  }
}