package com.main.assessment.job1;

public class Parent {

  public void print() {
    System.out.println("I'm Parent");
  }
}

class Child extends Parent {

  /**
   * If void print()
   * <p>
   * 'print()' in 'com.main.assessment.job1.Child' clashes with 'print()' in
   * 'com.main.assessment.job1.Parent'; attempting to assign weaker access privileges
   * ('package-private'); was 'public'
   */
  public void print() {  // Added public to avoid compilation error
    System.out.println("Child");
  }
}