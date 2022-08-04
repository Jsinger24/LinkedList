package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    private Node heads;
    private Node tails;
    private int size;

    public SinglyLinkedList() {
        super();
    }

    public SinglyLinkedList(Node heads, Node tails, int size) {
        super();
        this.heads = heads;
        this.tails = tails;
        this.size = size;
    }

    public Node getHeads() {
        return heads;
    }

    public void setHeads(Node heads) {
        this.heads = heads;
    }

    public Node getTails() {
        return tails;
    }

    public void setTails(Node tails) {
        this.tails = tails;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addFirstElement(int data) {
        Node node = new Node(data, null);
        size++;
        if (tails == null) {
            heads = node;
            tails = heads;
        } else {
            tails.setNext(node);
            tails = node;
        }
    }

    public void addLastElement(int data) {
        Node node = new Node(data, null);
        size++;
        if (tails == null) {
            heads = node;
            tails = heads;
        } else {
            tails.setNext(node);
            tails = node;
        }
    }

    public void removeFirstElement() {
        if (size == 0) {
            return;
        } else if (size == 1) {
            heads = null;
            tails = null;
            size = 0;
        } else {
            heads = heads.getNext();
            size--;
        }
    }

    public void removeLastElement() {
        if (size == 0) {
            return;
        } else if (size == 1) {
            heads = null;
            tails = null;
            size = 0;
        } else {
            Node temp = heads;
            for (int i = 0; i < size; i++) {
                if (temp.getNext() == tails) {
                    tails.setNext(null);
                } else {
                    temp = temp.getNext();
                }
            }
            size--;
        }
    }

    public void addElementAtPos(int index, int data) {
        if (index < size && index >= 0) {
            addFirstElement(data);
        } else if (index == size) {
            addLastElement(data);
        } else {
            Node node = new Node(data, null);
            Node temp = heads;
            for (int i = 1; i < size; i++) {
                if (i == index) {
                    Node afterNode = temp.getNext();
                    temp.setNext(node);
                    node.setNext(afterNode);
                    size++;
                } else {
                    temp = temp.getNext();

                }
            }
        }
    }

    public void removeAllElementWithTargetValue(int data) {
        if (heads.getData() == data) {
            removeFirstElement();
            removeAllElementWithTargetValue(data);
        } else {
            Node temp = heads;
            for (int i = 1; i < size; i++) {
                Node currentNode = temp.getNext();
                int currentNodeValue = currentNode.getData();
                if (currentNode == tails) {
                    tails = temp;
                    temp.setNext(null);
                    size--;
                    break;
                }
                if (currentNodeValue == data) {
                    temp.setNext(currentNode.getNext());
                    size--;
                } else {
                    temp = temp.getNext();
                }
            }
        }
    }

    public void displayLinkedList() {
        if (size > 0) {
            String result = "Value: " + heads.getData();
            Node temp = heads.getNext();
            for (int i = 1; i < size; i++) {
                result += "," + temp.getData();
                if (temp != tails) {
                    temp = temp.getNext();
                }
            }
            System.out.println(result);
        } else {
            System.out.println("list is empty");
        }
    }
}
