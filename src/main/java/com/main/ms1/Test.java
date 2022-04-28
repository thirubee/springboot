package com.main.ms1;

import java.util.HashMap;
import java.util.Map;

public class Test {

  private String fname;
  private String lname;
  public Test(String fn, String ln) {
    this.fname = fn;
    this.lname = ln;
  }

  public static void main(String... args) {
    Test p1 = new Test("f1", "l1");
    Test p2 = new Test("f2", "l2");
    Map<Test, String> m = new HashMap<>();
    m.put(p1, "First");
    m.put(p2, "Secon");

    m.put(new Test("f1","l1"), "OVerr");
    System.out.println(m.size());
    System.out.println(m.get(new Test("f1","l1")));

  }

  public String getFname() {
    return fname;
  }

  public void setFname(String fname) {
    this.fname = fname;
  }

  public String getLname() {
    return lname;
  }

  public void setLname(String lname) {
    this.lname = lname;
  }


  @Override
  public int hashCode() {
    return 13;
  }

}
