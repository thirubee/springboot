package com.main.ms1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Test3 {

  public static void main(String[] args) {

   /* Map<String, AtomicInteger> m = new ConcurrentHashMap<>();
    m.get("").incrementAndGet();*/

    System.out.print("1 ");
    synchronized (args){
      System.out.print("2 ");
      try{
        args.wait();
      }catch(InterruptedException ex){}
    }
    System.out.print("3 ");
  }

}
