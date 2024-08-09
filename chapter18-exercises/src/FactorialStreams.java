//// exercise 18.28:
//// Recursive factorial method.
//
//import java.util.stream.IntStream;
//
//public class FactorialStreams {
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
//
////            using streams and the range closed
//
//             System.out.printf("%d! = %d%n", factorial(21), IntStream.rangeClosed(0,21));
//        }
//    }
