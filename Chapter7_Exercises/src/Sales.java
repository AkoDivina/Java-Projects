//import java.security.SecureRandom;
//
//
//public class Sales{
//    public static void main(String[] args){
//        SecureRandom random = new SecureRandom();
//        int[] myarray = new int[10];
//        int pay = 200;
//        int gross = random.nextInt(20_000);
//        double increase = 0.09 * gross;
//        double totalpay = pay + increase;
//    }
////
////    for(int i = 0; i < myarray.length; i++ ){
////      System.out.printf("%f%n", i );
////    }
//}

import java.util.Scanner;
import java.security.SecureRandom;

public class Sales {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define salary ranges (modify these as needed)
        int[] salaryRanges = {299, 399, 599, 699, 799, 899, 999, Integer.MAX_VALUE}; // No upper bound for the last range

        // Get the number of salespeople
        System.out.print("Enter the number of salespeople: ");
        int numSalespeople = scanner.nextInt();

        // Initialize counters for each salary range (one-dimensional array)
        int[] counters = new int[salaryRanges.length];

        // Get gross sales of salespeople
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < numSalespeople; i++) {
            double grossSales = random.nextInt(15_000);
//            System.out.print("Enter gross sales for salesperson " + (i + 1) + ": ");
//            double grossSales = scanner.nextDouble();

            // Calculate commission and total salary
            double commission = grossSales * 0.09;
            int salary = (int) (200 + commission); // Truncate to integer

            // Find the range for this salary
            boolean foundRange = false;
            for (int j = 0; j < salaryRanges.length; j++) {
                if (salary <= salaryRanges[j]) {
                    counters[j]++;
                    foundRange = true;
                    break;
                }
            }

            // Salary out of range (technically not possible here)
            if (!foundRange) {
                System.out.println("Salary calculation resulted in an unexpected value.");
            }
        }

        // Print results
        System.out.println("\nSalary Range\t\tFrequency");

        for (int i = 0; i < salaryRanges.length; i++) {
            int upperBound = salaryRanges[i];
            String upperBoundStr = upperBound == Integer.MAX_VALUE ? "&_over" : String.valueOf(upperBound);
            System.out.println("$" + (i == 0 ? 200 : salaryRanges[i - 1] + 1) + " -   $" + upperBoundStr + "     " + counters[i]);
        }
    }
}