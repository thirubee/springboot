package com.main.exception;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Propagation extends Super {

  public static void main(String[] args) throws URISyntaxException {
    try{
      Propagation propagation = new Propagation();
      propagation.printLines();
    }catch (NullPointerException npe){
      npe.printStackTrace();
    }

  }
}

class Super {

  void printLines() throws URISyntaxException {
    try {
      List<String> lines = Files.readAllLines(Paths.get(new URI("C:\\sample.txt")));
      lines.stream().forEach(System.out::println);
      throw new IOException();
    } catch (IOException ex) {
      throw new NullPointerException();
    }
  }
}