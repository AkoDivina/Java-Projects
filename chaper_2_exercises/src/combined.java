//an application that inputs
//three integers from the user and displays the sum, average, product,
//smallest and largest of the numbers.

import java.util.Scanner;
public class combined {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter an integer");
        int num1 = input.nextInt();
        System.out.print("enter another integer");
        int num2 = input.nextInt();
        System.out.print("enter another integer");
        int num3 = input.nextInt();
//        integer.toBinaryString(int);

        if (num1 > (num2 & num3)) {
            System.out.printf("%d is the largest%n", num1);
        }
        if (num2 > (num1 & num3)) {
            System.out.printf("%d is the largest%n", num2);
        }
        if (num3 > (num1 & num2)) {
            System.out.printf("%d is the largest%n", num3);
        }
        //smallest
        if (num1 < (num2 & num3)) {
            System.out.printf("%d is the smallest%n", num1);
        }
        if (num2 < (num1 & num3)) {
            System.out.printf("%d is the smallest%n", num2);
        }
        if (num3 < (num1 & num2)) {
            System.out.printf("%d is the smallest%n", num3);
        }
        if (num1 == (num2 & num3)) {
            System.out.printf(" These numbers %d, %d and %d are equal", num1, num2, num3);
        }
        int sum = num1 + num2 + num3;
        int product = num1 * num2 * num3;
        int average = sum/3;

        System.out.printf("The sum of %d, %d and %d is %d%n The product is %d%n The average is %d", num1, num2,num3, sum, product, average);
    }//end of main
}// end of class