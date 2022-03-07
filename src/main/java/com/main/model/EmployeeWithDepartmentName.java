package com.main.model;


import java.util.Comparator;

public class EmployeeWithDepartmentName implements Comparator<EmployeeWithDepartmentName> {

  @Override
  public int compare(EmployeeWithDepartmentName o1, EmployeeWithDepartmentName o2) {
    return 0;
  }

  private int id;
  private String name;
  private Double salary;
  private String departmentName;

  public EmployeeWithDepartmentName(int id, String name, Double salary,
      String departmentName) {
    this.id = id;
    this.name = name;
    this.salary = salary;
    this.departmentName = departmentName;
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

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }
}
