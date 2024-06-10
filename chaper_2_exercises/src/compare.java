//an application that asks the user to enter
//two integers, obtains them from the user and displays the larger number

import java.util.Scanner;
public class compare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter an integer");
        int num1 = input.nextInt();

        System.out.print("enter another integer");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.printf("%d is larger", num1);
        }
        if (num2 > num1) {
            System.out.printf("%d is larger", num2);
        }
        if (num1 == num2) {
            System.out.printf(" These numbers %d and %d are equal", num1, num2);
        }
    }//end of main
}// end of class