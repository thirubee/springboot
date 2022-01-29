package com.main.collectionexample;

import com.main.model.Employee;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

  public static void main(String[] args){

    Map<Employee, Employee> map = new HashMap<>();
    Employee nilan = new Employee(1, "nilan", "Hyderabad");
    Employee magizh = new Employee(1, "nilan", "Hyderabad");
    Employee thee = new Employee(3, "thee", "Bangalore");

    map.put(nilan, nilan);
    map.put(magizh, magizh);
    map.put(thee, thee);

    for(Map.Entry<Employee, Employee> entry : map.entrySet()){
      System.out.println(entry.getKey().getName());
    }

    map.forEach( (x,y) -> {
      System.out.println(x);
      System.out.println(y);
    });


  }

}

