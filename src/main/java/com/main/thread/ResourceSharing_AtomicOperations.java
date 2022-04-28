package com.main.thread;

public class ResourceSharing_AtomicOperations {

  public static void main(String[] args) throws InterruptedException {

    InventoryCounter inventoryCounter = new InventoryCounter();
    IncrementThread incrementThread = new IncrementThread(inventoryCounter);
    DecrementThread decrementThread = new DecrementThread(inventoryCounter);

    incrementThread.start();
    decrementThread.start();

    incrementThread.join();
    decrementThread.join();

    System.out.println("We currently have " + inventoryCounter.getItem());
  }

  public static class DecrementThread extends Thread {

    private InventoryCounter inventoryCounter;

    public DecrementThread(InventoryCounter inventoryCounter) {
      this.inventoryCounter = inventoryCounter;
    }

    @Override
    public void run() {
      for (int i = 0; i < 100000000; i++) {
        inventoryCounter.decrement();
      }
    }
  }

  public static class IncrementThread extends Thread {

    private InventoryCounter inventoryCounter;

    public IncrementThread(InventoryCounter inventoryCounter) {
      this.inventoryCounter = inventoryCounter;
    }

    @Override
    public void run() {
      for (int i = 0; i < 100000000; i++) {
        inventoryCounter.increment();
      }
    }
  }


  private static class InventoryCounter {

    Object object = new Object();
    private int item = 0;

    public void increment() {
      synchronized (this.object) {
        item++;
      }
    }

    public void decrement() {
      synchronized (this.object) {
        item--;
      }
    }

    public int getItem() {
      return this.item;
    }

  }

}
