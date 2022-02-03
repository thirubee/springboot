package com.main.assessment.job1;

public class SampleTestOne {

  /**
   * if we add  public void display(String...s, int len){
   *
   * Vararg parameter must be the last in the list
   *
   */

  public void display(int len, String...s){
     System.out.println("String");
  }

  public static void main(String[] args) {
    new SampleTestOne().display(1, "Thiru");
    new SampleTestOne().display(2, "Magizh","Nilan");
  }

}
