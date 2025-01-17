// Fig. 6.3: MaximumFinder.java
// Programmer-declared method maximum with three double parameters.
import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        // create Scanner for input from command window
        Scanner input = new Scanner(System.in);

        // prompt for and input three floating-point values
        System.out.print(
                "Enter three floating-point values separated by spaces: ");
        double number1 = input.nextDouble(); // read first double
        double number2 = input.nextDouble(); // read second double
        double number3 = input.nextDouble(); // read third double

        // determine the maximum value
        double result = maximum(number1, number2, number3);

        // display maximum value
        System.out.println("Maximum is: " + result);
    }

    // returns the maximum of its three double parameters
    public static double maximum(double x, double y, double z) {
        double maximumValue = x; // assume x is the largest to start

        // determine whether y is greater than maximumValue
        if (y > maximumValue) {
            maximumValue = y;
        }

        // determine whether z is greater than maximumValue
        if (z > maximumValue) {
            maximumValue = z;
        }

        return maximumValue;
    }
 // you can use the math lib or as above, this short line of code below simply does what the above states
//    return Math.max(x, Math.max(y, z));
//}
}