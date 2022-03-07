package com.main.assessment.job2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayShuffling {

  public static void main(String[] args) {

    List<Integer> arrayShuffle = new ArrayList<>();

    arrayShuffle.add(20);
    arrayShuffle.add(10);
    arrayShuffle.add(30);
    arrayShuffle.add(15);

    arrayShuffle.forEach(System.out::print);

    Collections.shuffle(arrayShuffle);

    arrayShuffle.forEach(System.out::print);

  }

}
