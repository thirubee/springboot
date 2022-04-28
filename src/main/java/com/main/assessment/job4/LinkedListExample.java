package com.main.assessment.job4;

import com.main.assessment.job4.LinkedList.Node;

public class LinkedListExample {

  public static void main(String[] args) {

    LinkedList linkedList = new LinkedList();
    LinkedList.Node head = linkedList.head();
    linkedList.add(new LinkedList.Node("1"));
    linkedList.add(new LinkedList.Node("2"));
    linkedList.add(new LinkedList.Node("3"));
    linkedList.add(new LinkedList.Node("4"));

    LinkedList.Node current = head;


  }

}
class LinkedList {

  private Node head;
  private Node tail;

  LinkedList(){
    this.head = new Node("head");
    tail = head;
  }

  public Node head(){
    return head;
  }

  void add(Node node){
    tail.next = node;
    tail = node;
  }

  public static class Node {

    private Node next;
    private String data;

    Node(String data) {
      this.data = data;
    }

    public Node getNext() {
      return next;
    }

    public void setNext(Node next) {
      this.next = next;
    }

    public String getData() {
      return data;
    }

    public void setData(String data) {
      this.data = data;
    }

  }

}