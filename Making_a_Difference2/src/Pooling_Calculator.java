// an application that calculates your daily driving cost, so
//that you can estimate how much money could be saved by car pooling


import java.util.Scanner;
public class Pooling_Calculator {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter an your weight in kilograms");
            float weight = input.nextFloat();

            System.out.print("Enter an your height in meters");
            float height = input.nextFloat();

            float Body_MI = weight / (height * height);

            System.out.printf("your BMI is %f", Body_MI);

            System.out.print("BMI Categories:\n" +
                    "  Underweight = <18.5\n" +
                    "  Normal weight = 18.5–24.9\n" +
                    "  Overweight = 25–29.9\n" +
                    "  Obesity = BMI of 30 or greater");


        }//end of main
    }//end of class