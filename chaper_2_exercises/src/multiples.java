//an application that reads two integers, determines
//whether the first is a multiple of the second and prints the result

import java.util.Scanner;
public class multiples {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer");
        int num1 = input.nextInt();
        System.out.print("Enter an integer");
        int num2 = input.nextInt();

        if(num1%num2==0){
            System.out.printf("%d is a multiple of %d", num1, num2);
        }
        if(num1%num2!=0){
            System.out.printf("%d is not a multiple of %d", num1, num2);
        }

    }
}