package com.main.assessment.job2;

import java.util.HashMap;
import java.util.Map;

public class HashMapTesting {

  public static void main(String[] args) {
    Map<Pojo, Integer> hashMap = new HashMap<>();
    Pojo key = new Pojo();
    key.setValue("abc");
    hashMap.put(key, 1);
    key.setLength(12);
    Integer i = hashMap.get(key);
    System.out.println(i);
  }

}

class Pojo {

  private String value;
  private Integer length;


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }
}