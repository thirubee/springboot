package com.main.pattern.creational;

public final class Singleton {

  /**
   */

  private static final Singleton instance = null;

  private Singleton() {
  }

  public Singleton getInstance() {
    if (instance == null) {
      return new Singleton();
    } else {
      return instance;
    }
  }


}
