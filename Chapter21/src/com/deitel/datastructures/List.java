// Fig. 21.3: List.java
// ListNode and List class declarations.
package com.deitel.datastructures;

import java.util.NoSuchElementException;

// Class to represent one node in a list
class ListNode<E> {
    E data; // data for this node
    ListNode<E> nextNode; // reference to the next node in the list

    // Constructor creates a ListNode that refers to the object
    ListNode(E object) {
        this(object, null);
    }

    // Constructor creates ListNode that refers to the specified
    // object and to the next ListNode
    ListNode(E object, ListNode<E> node) {
        data = object;
        nextNode = node;
    }

    // Return reference to data in node
    E getData() {
        return data;
    }

    // Return reference to next node in list
    ListNode<E> getNext() {
        return nextNode;
    }
}

// Class List definition
public class List<E> {
    private ListNode<E> firstNode;
    private ListNode<E> lastNode;
    private String name; // string like "list" used in printing

    // Constructor creates empty List with "list" as the name
    public List() {
        this("list");
    }

    // Constructor creates an empty List with a name
    public List(String listName) {
        name = listName;
        firstNode = lastNode = null;
    }

    // Insert item at front of List
    public void insertAtFront(E insertItem) {
        if (isEmpty()) { // firstNode and lastNode refer to same object
            firstNode = lastNode = new ListNode<E>(insertItem);
        } else { // firstNode refers to new node
            firstNode = new ListNode<E>(insertItem, firstNode);
        }
    }

    // Insert item at end of List
    public void insertAtBack(E insertItem) {
        if (isEmpty()) { // firstNode and lastNode refer to same object
            firstNode = lastNode = new ListNode<E>(insertItem);
        } else { // lastNode's nextNode refers to new node
            lastNode.nextNode = new ListNode<E>(insertItem);
            lastNode = lastNode.nextNode;
        }
    }

    // Remove first node from List
    public E removeFromFront() throws NoSuchElementException {
        if (isEmpty()) { // throw exception if List is empty
            throw new NoSuchElementException(name + " is empty");
        }

        E removedItem = firstNode.data; // retrieve data being removed

        // Update references firstNode and lastNode
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            firstNode = firstNode.nextNode;
        }

        return removedItem; // return removed node data
    }

    // Remove last node from List
    public E removeFromBack() throws NoSuchElementException {
        if (isEmpty()) { // throw exception if List is empty
            throw new NoSuchElementException(name + " is empty");
        }

        E removedItem = lastNode.data; // retrieve data being removed

        // Update references firstNode and lastNode
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else { // locate new last node
            ListNode<E> current = firstNode;

            // Loop while current node does not refer to lastNode
            while (current.nextNode != lastNode) {
                current = current.nextNode;
            }

            lastNode = current; // current is new lastNode
            current.nextNode = null;
        }

        return removedItem; // return removed node data
    }

    // Determine whether list is empty; returns true if so
    public boolean isEmpty() {
        return firstNode == null;
    }

    // Output list contents
    public void print() {
        if (isEmpty()) {
            System.out.printf("Empty %s%n", name);
            return;
        }

        System.out.printf("The %s is: ", name);
        ListNode<E> current = firstNode;

        // While not at end of list, output current node's data
        while (current != null) {
            System.out.printf("%s ", current.data);
            current = current.nextNode;
        }

        System.out.println();
    }
}
