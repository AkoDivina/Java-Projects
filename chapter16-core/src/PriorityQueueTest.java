// Fig. 16.14: PriorityQueueTest.java
 // PriorityQueue test program.
         import java.util.PriorityQueue;
public class PriorityQueueTest {
    public static void main(String[] args) {
        // queue of capacity 11
        PriorityQueue<Double> queue = new PriorityQueue<>();

        // insert elements to queue
        queue.offer(3.2);
        queue.offer(9.8);
        queue.offer(5.4);

//        queue.size();  // doesn't seem to work do not know why



        System.out.print("Polling from queue:");

        // display elements in queue
        while (queue.size() > 0) {
            System.out.printf("%.1f ", queue.peek()); // view top element
            queue.poll(); // remove top element


        }
//        queue.clear(); // remove top element
//            System.out.printf("%.1f ", queue); // view top element

//
        }
    }


