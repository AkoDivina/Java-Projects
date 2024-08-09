//// Fig. 18.3: FactorialCalculator.java
// // Recursive factorial method.
//
//import java.util.stream.IntStream;
//
//public class FactorialCalculator {
//    // recursive method factorial (assumes its parameter is >= 0)
//    public static long factorial(long number) {
//        if (number <= 1) { // test for base case
//            return 1; // base cases: 0! = 1 and 1! = 1
//        } else { // recursion step
//            return number * factorial(number - 1);
//            //factorial is an inbuilt function
//        }
//    }
//
//    public static void main(String[] args) {
//        // calculate the factorials of 0 through 21
////
//        for (int counter = 0; counter <= 21; counter++) {
//            System.out.printf("%d! = %d%n", counter, factorial(counter));
////             }
//
//        }
//    }
//}
//

// Fig. 18.4: FactorialCalculator.java
 // Recursive factorial method.
         import java.math.BigInteger;

public class FactorialCalculator {
 // recursive method factorial (assumes its parameter is >= 0)
         public static BigInteger factorial(BigInteger number) {
         if (number.compareTo(BigInteger.ONE) <= 0) { // test base case
             return BigInteger.ONE; // base cases: 0! = 1 and 1! = 1
             }
         else { // recursion step
             return number.multiply(
                     factorial(number.subtract(BigInteger.ONE)));
             //this line compares the BigInteger number with the BigInteger constant
             //ONE, which represents the integer value 1
             }
         }

         public static void main(String[] args) {
         // calculate the factorials of 0 through 50
         for (int counter = 0; counter <= 50; counter++) {
             System.out.printf("%d! = %d%n", counter,
                     factorial(BigInteger.valueOf(counter)));
             }
         }
 }