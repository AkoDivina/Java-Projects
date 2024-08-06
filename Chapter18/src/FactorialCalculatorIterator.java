// Fig. 18.9: FactorialCalculator.java
 // Iterative factorial method.

public class FactorialCalculatorIterator {
 // iterative declaration of method factorial
         public static long factorial(long number) {
         long result = 1;

        // iteratively calculate factorial
         for (long i = number; i >= 1; i--) {
             result *= i;
             }

         return result;
         }

    public static void main(String[] args) {
        // calculate the factorials of 0 through 10
        for (int counter = 0; counter <= 10; counter++) {
            System.out.printf("%d! = %d%n", counter, factorial(counter));
        }
    }

    }

