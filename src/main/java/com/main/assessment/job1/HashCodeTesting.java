package com.main.assessment.job1;

public class HashCodeTesting {

  String value;

  HashCodeTesting(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public boolean equals(Object o) {
    String str = (String) o;
    return value.equals(str);
  }

  public int hashCode() {
    return value.hashCode();
  }

}
