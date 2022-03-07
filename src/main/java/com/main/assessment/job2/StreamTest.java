package com.main.assessment.job2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class StreamTest {

  public static void main(String[] args) {

    Stream stream = Stream.of(10, 20, "30");
    //stream.forEach(System.out::println);

    char[] ch = new char[]{'a', 'b', '@', '2'};

    List<String> listOfString = Arrays.asList("thiru", "mithra", "nilan", "magizh", "thiru");

    Set<String> set = new TreeSet<>(listOfString);

    System.out.println("*****************************");
    listOfString.forEach(System.out::println);
    System.out.println("*****************************");

    listOfString.stream().sorted(Comparator.reverseOrder());

    Comparator<String> com = Comparator.reverseOrder();

    System.out.println("*****************************");
    listOfString.forEach(System.out::println);
    System.out.println("*****************************");

    System.out.println("*****************************");
    System.out.println(listOfString.stream().peek(System.out::println).findAny().orElse("NA"));
    System.out.println("*****************************");

  }

}
