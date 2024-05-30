import java.security.SecureRandom;
import java.security.Security;

//// An array that draws a triangle
////when the user inputs the size of the array, it loops through and produces a triangle based on his number
//
//
public class triangle {
    public static void main(String[] args) {
//        int[][] array1 = new int[10][5];
        int [][] array1 = {{1,2,3,4,5,6},{1,2,3,4},{1,2,3},{1,2},{1}};
        //delete from here, check book for more


//        float[] c = new float[100];
//        public static void main()
//        int randomIndex = new SecureRandom().nextFloat(c.length);
////       float[] c = input.nextFloat(java.security.SecureRandom);
//            float sum = 0;
//            for (int i = 0; i < c.length; i++) {
//                sum += c[i];
//
//
//                System.out.printf("sum is %f%n", sum);
//
//
//
//            }


    }
    public static String stars = "*";
    public static void outputArray(int[][] array) {
        // loop through array's rows
        for (int row = 0; row < array.length; row++) {
            // loop through columns of current row
            for (int column = 0; column < array[row].length; column++) {
                System.out.printf("%s ",stars);
            }

            System.out.println();
        }
    }
}