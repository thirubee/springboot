package com.main.ms1;

public class Car<T> {

  public static void main(String[] args) {
    Car<String> c1 = new Car<>();
    Car c2 = c1;
  }

  void set(T t) {

  }
}
