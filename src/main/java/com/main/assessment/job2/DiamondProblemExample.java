package com.main.assessment.job2;

interface I1 {

  default void display() {
    System.out.println("I1");
  }
}

interface I2 {

  default void display() {
    System.out.println("I2");
  }
}

public class DiamondProblemExample implements I1, I2 {

  public static void main(String[] args) {

  }

  @Override
  public void display() {
    I1.super.display();
  }
}