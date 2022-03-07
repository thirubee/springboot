package com.main.immutable;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public final class Employee {

  private final String name;
  private final Map<String, String> map;
  private final LocalDate localDate;
  private final Date date;

  Employee(String name, Map<String, String> map, LocalDate localDate, Date date) {
    this.name = name;
    this.date = date;
    this.localDate = localDate;
    HashMap<String, String> deepMap = new HashMap<>();
    map.forEach((k, v) -> {
      deepMap.put(k, v);
    });
    this.map = deepMap;
  }

  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();
    map.put("A", "Arasu");
    map.put("M", "Magizh");

    LocalDate localDate = LocalDate.now();
    Date date = new Date();
    String val = "Emp1";
    Employee emp = new Employee("emp1", map, localDate, date);
    val = "Emp2";
    localDate = LocalDate.of(2021, 2, 4);
    date = new Date(2021, 2, 4);
    map.put("N", "Nilan");

    System.out.println(emp.getMap());
    System.out.println(emp.getName());
    System.out.println(emp.getLocalDate());
    System.out.println(emp.getName());
    System.out.println(emp.getDate());

  }

  public String getName() {
    return this.name;
  }

  public Map<String, String> getMap() {
    return this.map;
  }

  public LocalDate getLocalDate() {
    return this.localDate;
  }

  public Date getDate() {
    return this.date;
  }

}
