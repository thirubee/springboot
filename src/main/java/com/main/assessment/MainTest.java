package com.main.assessment;

public class MainTest {

  public static void main(String[] args) {
    T t = new T(){
      @Override
      public void run(){
        System.out.print("HI ");
      }
    };
    t.start();
  }
}
class T extends Thread{
  T(){
    System.out.print("T");
  }

  @Override
  public void run() {
    System.out.print("run");
  }

  public void run(String s){
    System.out.print("run with param");
  }
}