// Fig. 17.3: StreamReduce.java
 // Sum the integers from 1 through 10 with IntStream.
         import java.util.stream.IntStream;

         public class StreamReduced {
 public static void main(String[] args) {
     // sum the integers from 1 through 10
     System.out.printf("Sum of 1 through 10 is: %d%n",
             IntStream.rangeClosed(1, 10)
                     .sum());

// upto but not including 10
//     .rangeClosed vs .range
     System.out.printf("Sum of 1 through 10 is: %d%n",
             IntStream.range(1, 10)
                     .sum());
 }

 }