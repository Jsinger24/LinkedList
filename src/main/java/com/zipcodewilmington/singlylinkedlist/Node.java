package com.zipcodewilmington.singlylinkedlist;

public class Node {
    private int data;
    private Node next;

    public Node(){
        super();
    }

    public Node(int data, Node next){
        super();
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
