package com.deitel.datastructures;
// Fig. 21.12: com.deitel.datastructures.QueueTest.java
 // Class com.deitel.datastructures.QueueTest.
import com.deitel.datastructures.Queue;
import java.util.NoSuchElementException;

public class QueueTest {
         public static void main(String[] args) {
         Queue<Integer> queue = new Queue<>();
                 // use enqueue method
         queue.enqueue(-1);
         queue.print();
         queue.enqueue(0);
         queue.print();
         queue.enqueue(1);
         queue.print();
         queue.enqueue(5);
         queue.print();

         // remove objects from queue
         boolean continueLoop = true;

         while (continueLoop) {
             try {
                 int removedItem = queue.dequeue(); // remove head element
                 System.out.printf("%n%d dequeued%n", removedItem);
                 queue.print();
                 }
             catch (NoSuchElementException noSuchElementException) {
                 continueLoop = false;
                 noSuchElementException.printStackTrace();
                 }
             }
         }
 }