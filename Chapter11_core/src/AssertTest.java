 // Fig. 11.8: AssertTest.java
         // Checking with assert that a value is within range
         import java.util.Scanner;

public class AssertTest {
         public static void main(String[] args) {
             Scanner input = new Scanner(System.in);

             System.out.print("Enter a number between 0 and 10: ");
             int number = input.nextInt();

                 // assert that the value is >= 0 and <= 10
//             static void assertNum(num)
             {
//                 if (number >= 0 && number <= 10){
//                     System.out.printf("You entered %d%n", number);
//                 }else {
//                     System.out.printf(" %d is out of range", number);
//                 }
                 assert (number >= 0 && number <= 10) : "bad number: " + number;

                 System.out.printf("You entered %d%n", number);
             }


//                 System.out.printf("You entered %d%n", number);
         }

 }


