package com.main.assessment.log2base2;

public class SingleLinkedListNodeOperation {

  public static void main(String[] args) {
    SingleLinkedListNodeOperation nodeAddOperation = new SingleLinkedListNodeOperation();
    nodeAddOperation.addHeadMiddleTail(10, 20, 30);
    nodeAddOperation.addAtFirst(45);

  }

  public void deleteLastNode(int val){
    Node head = null;
  }

  public void addAtLast(int val) {
    Node head = null;
    System.out.println("******************************");
    Node lastNode = new Node();
    lastNode.data = val;
    lastNode.next = null;

    if (head == null) {
      head = lastNode;
    } else {
      Node temp = head;
      while (temp != null) {
        temp = temp.next;
      }
      temp.next = lastNode;
    }
  }

  public void addAtFirst(int val) {
    System.out.println("******************************");
    Node head = null;

    Node temp = new Node();
    temp.data = val;
    temp.next = head;
    head = temp;

    /**
     * Print node
     */
    Node printNode = head;
    while (printNode != null) {
      System.out.println(printNode.data);
      printNode = printNode.next;
    }

  }

  public Node addHeadMiddleTail(int... val) {
    System.out.println("******************************");
    Node head, middle, tail;

    head = new Node();
    head.data = val[0];

    middle = new Node();
    middle.data = val[1];

    tail = new Node();
    tail.data = val[2];

    head.next = middle;
    middle.next = tail;
    tail.next = null;

    Node temp = head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
    return head;
  }

  class Node {

    int data;
    Node next;
  }
}
