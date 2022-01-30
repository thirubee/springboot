package com.main.model;

public class Employee implements Comparable<Employee> {

  @Override
  public int compareTo(Employee o) {
    return o.getId();
  }

  private int id;
  private String name;
  private String address;

  public Employee(int id, String name, String address) {
    this.id = id;
    this.name = name;
    this.address = address;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public int hashCode() {
    return 12;
  }



  @Override
  public boolean equals(Object obj) {
    Employee emp = (Employee) obj;
    return name.equals(((Employee) obj).name);
  }
}
