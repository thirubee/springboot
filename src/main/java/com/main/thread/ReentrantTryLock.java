package com.main.thread;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantTryLock {

  public static void main(String[] args) {

  }

  public static class PriceUpdater extends Thread{
    private PriceContainer priceContainer;
    private Random random = new Random();
    public PriceUpdater(PriceUpdater priceUpdater){

    }
  }

  public static class PriceContainer {

    private Lock lock = new ReentrantLock();

    private double bitcoinPrice;
    private double ripplePrice;

    public Lock getLock() {
      return lock;
    }

    public void setLock(Lock lock) {
      this.lock = lock;
    }

    public double getBitcoinPrice() {
      return bitcoinPrice;
    }

    public void setBitcoinPrice(double bitcoinPrice) {
      this.bitcoinPrice = bitcoinPrice;
    }

    public double getRipplePrice() {
      return ripplePrice;
    }

    public void setRipplePrice(double ripplePrice) {
      this.ripplePrice = ripplePrice;
    }
  }

}
