// Fig. 17.4: StreamMapReduce.java
 // Sum the even integers from 2 through 20 with IntStream.
         import java.util.stream.IntStream;

         public class StreamMapReduce {
 public static void main(String[] args) {
         // sum the even integers from 2 through 20
     System.out.printf("Sum of the even integers from 2 through 20 is: %d%n", IntStream.rangeClosed(1, 10)
             .map((int x) -> {
                 return x * 2;}) // multiply by 2

//             the range is 1 to 10, mapping it takes each element including 10
//             and multiplies it by 2 to make it even then sums it up
              .sum()); // sum


         }
}