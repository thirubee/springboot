package com.main.assessment.job1;

public class FinallyTest {

  public static void main(String[] args) {
    Float pi = new Float(3.14f);
    if (pi > 5) {
      System.out.println("PI is bigger than 5");
    } else {
      System.out.println("PI is not bigger than 5");
    } /**
     finally block can't be used here
     */
    /*finally{
      System.out.println("Have a nice day!");
    }*/
  }

}
