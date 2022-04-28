package com.main.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test12 {

  static Iterator reverse(List lis){
    Collections.reverse(lis);
    return lis.iterator();
  }

  public static void main(String[] args) {
    Test12 t = new Test12();
    t.execute();



  }

  void execute() {


    Person p1 = new Person("Test", "Test");
    Person p2 = new Person("Test", "Test");
    Integer i1 = new Integer("10");
    Integer i2 = new Integer("10");

    Set<Person> s1 = new HashSet<>();
    Set<Integer> s2 = new HashSet<>();
    Map<Person, Person> m1 = new HashMap<>();
    Map<Integer, Integer> m2 = new HashMap<>();

    s1.add(p1);
    s1.add(p2);

    s2.add(i1);
    s2.add(i2);

    m1.put(p1, p1);
    m1.put(p2, p2);

    m2.put(i1, i1);
    m2.put(i1, i1);

    System.out.println(s1);
    System.out.println(m1);

    System.out.println(s2);
    System.out.println(m2);
  }

  class Person {

    String fname;
    String lname;

    public Person(String fname, String lname) {
      this.fname = fname;
      this.lname = lname;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      Person person = (Person) o;
      return fname.equals(person.fname) && lname.equals(person.lname);
    }

    @Override
    public int hashCode() {
      return 420;
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
  }

}
