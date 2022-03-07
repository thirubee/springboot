package com.main.assessment.job1;

public class SampleTestFour {

  /**
   * if we add public void doit() {}  -->  'doit()' clashes with 'doit()'; both methods have same
   * erasure
   */

  /*public void doit() {
  }*/
  public String doit() {
    return "a";
  }

  public Double doit(int x) {
    return 1.0;
  }

}
