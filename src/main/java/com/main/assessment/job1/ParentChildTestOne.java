package com.main.assessment.job1;

public class ParentChildTestOne {

  public static void main(String[] args) {
    Test obj = new Test();
    /**
     * we can't access private method
     */
    //obj.display();
  }
}

class Test {

  private void display() {
    System.out.println("Hello Java");
  }
}