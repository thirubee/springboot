package com.main.pattern;

import com.main.pattern.creational.factory.VendorFactory;

public class PatternTester {

  public static void main(String[] args) {
    String name = new VendorFactory().getVendor("super").get().getName();
    System.out.println(name);
  }

}
