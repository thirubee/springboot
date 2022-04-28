package com.main.collectionexample;

import com.main.model.Employee;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ArrayListExample {

  public static void main(String[] args) {

    Employee nilan = new Employee(1, "nilan", "Hyderabad");
    Employee thee = new Employee(3, "thee", "Bangalore");
    Employee magizh = new Employee(1, "nilan", "Hyderabad");

    List<Employee> list = Arrays.asList(nilan, magizh, thee);

    Set<Employee> set = new TreeSet<>();
    set.add(nilan);

    for (Employee x : list) {
      System.out.println(x.getId() + x.getName());
    }

    System.out.println("----------------");

    /* Iteration */
    list.forEach(x -> System.out.println(x.getId() + x.getName()));

    System.out.println("----------------");

    /* Method Ref */
    list.forEach(x -> System.out.println(x.getId() + x.getName()));

    System.out.println("----------------");

    /* Sorting */
    list.stream().sorted().collect(Collectors.toList());
    list.forEach(x -> System.out.println(x.getId() + x.getName()));

    /* Count */
    Long count = list.stream().filter(x -> x.getId() > 1).count();
    System.out.println(count);

    /* Comparator based on Employee Name */
    Comparator<Employee> comparatorByName = Comparator.comparing(Employee::getName);
    list.stream().sorted(comparatorByName).forEach(x -> System.out.println());


  }

  private void printer(Employee employee) {

  }

}
