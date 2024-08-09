//18.11 (Greatest Common Divisor) The greatest common divisor of
//integers x and y is the largest integer that evenly divides into both x and
//y. Write a recursive method gcd that returns the greatest common divisor
//of x and y. The gcd of x and y is defined recursively as follows: If y is
//equal to 0, then gcd(x, y) is x; otherwise, gcd(x, y) is gcd(y, x % y),
// where % is the remainder operator. Use this method to replace the
//one you wrote in the application of Exercise 6.27 .


import java.util.Scanner;
public class recursiveGCD {

    int gcd = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer");
        int x = input.nextInt();
        System.out.println("Enter second integer");
        int y = input.nextInt();
    }

    public static int recursiveGCD(int x, int y) {
        if (y == 0) {
            System.out.printf(" These numbers %d and %d have gcd of: %d", x, y, x);
return x;

        } else {
            System.out.printf(" These numbers %d and %d have gcd of", x, y, x % y);
            return x % y;
        }

    }



    }

