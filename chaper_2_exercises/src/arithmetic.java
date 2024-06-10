// an application that asks the user to enter two
//integers, obtains them from the user and prints their sum, product,
//difference and quotient (division)

import java.util.Scanner;
public class arithmetic{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("enter an integer");
        int num1 = input.nextInt();

        System.out.print("enter another integer");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;
        int difference = num1 - num2;
        int division = num1 / num2;

System.out.printf("The sum of %d and %d is %d%n The product is %d%n The difference is %d%n division is %d ", num1, num2, sum, product, difference, division);

    }
}
