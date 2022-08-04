package com.zipcodewilmington.singlylinkedlist;
import org.junit.Assert;
import org.junit.Test;



/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    @Test
    public void testAddFirstElement() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addFirstElement(10);
        Assert.assertEquals(singlyLinkedList.getSize(), 1);
        Assert.assertEquals(singlyLinkedList.getHeads().getData(), 10);
        Assert.assertEquals(singlyLinkedList.getHeads(),
                singlyLinkedList.getTails());
        Assert.assertNull(singlyLinkedList.getHeads().getNext());
    }

    @Test
    public void testAddLastElement() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addFirstElement(10);
        singlyLinkedList.addLastElement(20);
        Assert.assertEquals(singlyLinkedList.getSize(), 2);
        Assert.assertEquals(singlyLinkedList.getTails().getData(), 20);
        Assert.assertNull(singlyLinkedList.getTails().getNext());
    }

    @Test
    public void testAddElementAtPosition()  {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addFirstElement(10);
        singlyLinkedList.addLastElement(15);
        singlyLinkedList.addLastElement(20);
        singlyLinkedList.addElementAtPos(2, 17);
        Assert.assertEquals(singlyLinkedList.getSize(), 4);
        Assert.assertEquals(singlyLinkedList.getHeads().getNext().getNext()
                .getData(), 17);
    }

    @Test
    public void testRemoveFirstElement()  {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addFirstElement(10);
        singlyLinkedList.addLastElement(15);
        singlyLinkedList.addLastElement(20);
        singlyLinkedList.addElementAtPos(2, 17);
        singlyLinkedList.removeFirstElement();
        Assert.assertEquals(singlyLinkedList.getSize(), 3);
        Assert.assertEquals(singlyLinkedList.getHeads().getData(), 15);
    }

    @Test
    public void testRemoveLastElement()  {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addFirstElement(10);
        singlyLinkedList.addLastElement(15);
        singlyLinkedList.addLastElement(20);
        singlyLinkedList.addElementAtPos(2, 17);
        singlyLinkedList.removeLastElement();
        Assert.assertEquals(singlyLinkedList.getSize(), 3);
        Assert.assertEquals(singlyLinkedList.getTails().getData(), 17);
    }

    @Test
    public void testRemoveAllElementWithTargetValue()  {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addFirstElement(10);
        singlyLinkedList.addLastElement(15);
        singlyLinkedList.addLastElement(10);
        singlyLinkedList.addElementAtPos(2, 17);
        singlyLinkedList.removeAllElementWithTargetValue(10);
        Assert.assertEquals(singlyLinkedList.getSize(), 2);
        Assert.assertEquals(singlyLinkedList.getHeads().getData(), 15);
        Assert.assertEquals(singlyLinkedList.getTails().getData(), 17);
    }
}
