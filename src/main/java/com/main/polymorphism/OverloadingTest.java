package com.main.polymorphism;

public class OverloadingTest {

  public static void main(String[] args) {
    display(null);
  }

  static void display(Object e) {
    System.out.println("Object method called");
  }

/*  static void display(Integer e) {
    System.out.println("Integer method called");
  }*/

  static void display(String s) {
    System.out.println("String method called");
  }

}
