//an application that reads an integer and
//determines and prints whether it’s odd or even

import java.util.Scanner;
public class odd_even {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer");
        int num = input.nextInt();

        if(num%2==0){
            System.out.printf("%d is even", num);
        }
        if(num%2!=0){
            System.out.printf("%d is odd", num);
        }

    }
}