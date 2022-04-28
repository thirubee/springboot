package com.main.assessment.job3;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestException extends ExampleOne {

  // Can't add its child class exception --> FileNotFoundException

  @Override
  void display() throws IOException {
    super.display();
  }
}
class ExampleOne{

  void display() throws IOException {
    System.out.println("ExampleOne");
  }
}