//program that calculates and prints the product of three integers.

import java.util.Scanner;
public class product{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //prompt user to enter first integer
        System.out.print("Enter first integer");

        //read first integer and store in x
        int x = input.nextInt();

        //enter 2nd integer and store in y
        System.out.print("Enter 2nd integer");
        int y = input.nextInt();

        //enter third integer and store in z
        System.out.print("Enter 3rd integer");
        int z = input.nextInt();

        //compute product and store in result
        int result = x*y*z;

        //output the final answer using printf
        System.out.printf("Product is %d", result);


    }//end of main
}//end of class