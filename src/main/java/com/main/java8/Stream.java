package com.main.java8;

import com.main.model.EmployeeWithDepartmentName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Stream {

  public static void main(String[] args) {

    List<String> list = Arrays.asList("Test", "Value");

    EmployeeWithDepartmentName e1 = new EmployeeWithDepartmentName(1, "thiru", 200.00, "d1");
    EmployeeWithDepartmentName e2 = new EmployeeWithDepartmentName(2, "thiru", 300.00, "d1");
    EmployeeWithDepartmentName e3 = new EmployeeWithDepartmentName(3, "thiru", 100.00, "d2");
    EmployeeWithDepartmentName e4 = new EmployeeWithDepartmentName(4, "thiru", 600.00, "d2");
    EmployeeWithDepartmentName e5 = new EmployeeWithDepartmentName(5, "thiru", 350.00, "d1");

    Comparator<EmployeeWithDepartmentName> c1 = (c2,c3) -> c2.getSalary().compareTo(c3.getSalary());

    Set<EmployeeWithDepartmentName> s1 = new TreeSet<>(c1);
    s1.add(e1);

    List<EmployeeWithDepartmentName> l1 = new ArrayList();
    l1.addAll(Arrays.asList(e1, e2, e3, e4, e5));

    List<String> x1 = l1.stream().map(EmployeeWithDepartmentName::getName)
        .collect(Collectors.toList());

    Map<String, List<EmployeeWithDepartmentName>> x2 = l1.stream()
        .collect(Collectors.groupingBy(EmployeeWithDepartmentName::getDepartmentName));

    l1.stream().collect(Collectors.groupingBy(EmployeeWithDepartmentName::getDepartmentName,
        Collectors.collectingAndThen(
            Collectors.reducing((EmployeeWithDepartmentName a1, EmployeeWithDepartmentName a2) ->
              a1.getSalary() > a2.getSalary() ? a1 : a2
           ),Optional::get)));


  }

}

