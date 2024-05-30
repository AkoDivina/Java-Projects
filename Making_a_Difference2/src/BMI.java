/*e a BMI calculator that reads the user’s weight in pounds and height in inches
* (or, if you prefer, the user’s weight in kilograms and height in
*meters), then calculates and displays the user’s body mass index
 */

import java.util.Scanner;
public class BMI {
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