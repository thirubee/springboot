package com.main.java8;

import com.main.model.NextGenEmployee;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class EmployeeTopSalaryGroupByDepartment {

  public static void main(String[] args) {

    NextGenEmployee nextGen1 = new NextGenEmployee(1, "Thiru-Tamil", 100, "Tamil");
    NextGenEmployee nextGen2 = new NextGenEmployee(2, "Magizh-Tamil", 250, "Tamil");
    NextGenEmployee nextGen3 = new NextGenEmployee(3, "Nilan-Tamil", 200, "Tamil");

    NextGenEmployee nextGen4 = new NextGenEmployee(4, "Thiru-English", 5261, "English");
    NextGenEmployee nextGen5 = new NextGenEmployee(5, "Magizh-English", 250, "English");
    NextGenEmployee nextGen6 = new NextGenEmployee(6, "Nilan-English", 200, "English");

    NextGenEmployee nextGen7 = new NextGenEmployee(7, "Mithra-US", 5261, "Engineer");
    NextGenEmployee nextGen8 = new NextGenEmployee(8, "Magizh-US", 25000, "Engineer");
    NextGenEmployee nextGen9 = new NextGenEmployee(9, "Nilan-US", 200, "Engineer");

    List<NextGenEmployee> employeeList = List.of(nextGen1, nextGen2, nextGen3, nextGen4, nextGen5,
        nextGen6, nextGen6, nextGen7, nextGen8, nextGen9);

    Comparator<NextGenEmployee> maxSalary = Comparator.comparingDouble(NextGenEmployee::getSalary);

    Map<String, Optional<NextGenEmployee>> maxBySalaryGroupByDepartment = employeeList.stream()
        .collect(Collectors.groupingBy(NextGenEmployee::getDepartment, Collectors.reducing(
            BinaryOperator.maxBy(maxSalary))));

    maxBySalaryGroupByDepartment.entrySet().forEach(
        x -> {
          System.out.println(x.getKey() + "-" + x.getValue());
        }
    );

  }

}
