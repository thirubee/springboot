package com.main.string;

public class EqualIgnoreCase {

  public static void main(String[] args) {

    Object ob = "None";

    System.out.println(ob.toString().equalsIgnoreCase("none"));
    System.out.println(ob.toString().equalsIgnoreCase("None"));


  }

}
