package com.main.leetcode;

public class XYZ {

  static XYZ x;
  static int count = 0;
  public static void main(String[] args) throws InterruptedException {
    XYZ x1 = new XYZ();
    x1 = null;
    System.gc();
    Thread.sleep(1000);
    x = null;
    System.gc();
    Thread.sleep(1000);
    System.out.println(count);
  }

  @Override
  protected void finalize() throws Throwable {
    count++;
    x = this;
  }
}
