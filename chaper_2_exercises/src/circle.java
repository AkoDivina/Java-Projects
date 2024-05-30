/*an application that inputs from the user the radius of a
*circle as an integer and prints the circle’s diameter, circumference and area
*using the floating-point value 3.14159 for π.
*/


//import java.lang.Math.*;
import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius");
        int r = input.nextInt();

double diameter = 2 * r;
double circumference = 2 * Math.PI * r;
double area = Math.PI * r *r;


        System.out.printf("The diameter of the circle is 2 * %d is %f%n", r , diameter);
        System.out.printf("The circumference of the circle is 2 * %d * %f is %f%n", r, Math.PI, circumference );
        System.out.printf("The area of the circle is %f *%d  * %d is %f%n ",Math.PI , r , r, area);

    }//end of main
}// end of class