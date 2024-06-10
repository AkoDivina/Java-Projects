//Consider a two-by-three integer array t.
//        1. Write a statement that declares and creates t.
//        2. How many rows does t have?
//        3. How many columns does t have?
//        4. How many elements does t have?
//        5. Write access expressions for all the elements in row 1 of t.
//        6. Write access expressions for all the elements in column 2 of t.
//        7. Write a single statement that sets the element of t in row 0 and
//column 1 to zero.
//        8. Write individual statements to initialize each element of t to
//zero.
//9. Write a nested for statement that initializes each element of t to
//zero.
//10. Write a nested for statement that inputs the values for the
//elements of t from the user.
//        11. Write a series of statements that determines and displays the
//smallest value in t.
//        12. Write a single printf statement that displays the elements of
//the first row of t.
//13. Write a statement that totals the elements of the third column of
//t. Do not use iteration.
//        14. Write a series of statements that displays the contents of t in
//tabular format. List the column indices as headings across the
//top, and list the row indices at the left of each row

//import java.io.InputStream;
import java.util.Scanner;

public class TArray{
    public static void main(String[] args) {
        int [][] t = new int[2][3];
//        int[][] t = {{1, 2}, {3, 4}  , {5, 6};
        for (int row = 0; row < t.length; row++) {
            for (int column = 0; column < t[row].length; column++) {
                System.out.printf("\n elements of array t before %d", t[row][column]);
            }
        }

        System.out.print("\nelements of row 1 are:");
        for (int i = 0; i < t.length; i++) {
            System.out.printf(" %d", t[0][i]);
        }
        System.out.print("\nelements of column 2 are: ");
        for (int i = 0; i < t.length; i++) {
            System.out.printf(" %d", t[i][1]);
        }
        t[0][1] = 0;
        System.out.print("\nelement in index t[0][1] is :");
        System.out.printf("%d", t[0][1]);

        t[0][0] = 0;
        t[0][1] = 0;
        t[0][2] = 0;
        t[1][0] = 0;
        t[1][1] = 0;
        t[1][2] = 0;




        for (int row = 0; row < t.length; row++) {
            for (int column = 0; column < t[row].length; column++) {
                t[row][column] = 0;
                System.out.printf("\n elements of array t after %d", t[row][column]);
            }

        }
        Scanner scanner = new Scanner(System.in);
        for (int row = 0; row < t.length; row++) {
            for (int column = 0; column < t[row].length; column++) {
                System.out.print("Enter element at row " + (row + 1) + ", column " + (column + 1) + ": ");
                t[row][column] = scanner.nextInt();
//                System.out.println("\n enter the elements of the array");
//                System.out.printf("\n elements of array t before %d", t[row][column]);
//            }
            }
        }



//        //smallest 7.11
//        int smallest = t[0][0];
//        for(int i=0; i<t.length; i++) {
//            for (int j = 0; j < t[i].length; j++) {
////                System.out.printf("%d", t[i][j]);
//
//                if (t[i][j]<smallest) {
//                    smallest = t[i][j];
//
////
//
//
//            }//end of for column
//            System.out.printf(" the smallest number is %d%n", smallest);
//        }//end of for row


        //7.12 display elements of a row
        System.out.print( "elements of row 1 are");
        for(int i=0; i<t.length; i++) {

                System.out.printf( t[0][i] + " ");
            }
//        //7.13 totals elements of column 3 without using iteration
        System.out.println("\n\n sum of last column elements are: "+ t[0][2] + "+" + t[1][2] + "=" + (t[0][2] + t[1][2]));

        // displays elements of t stating their various indices as headings
        System.out.println("\n\nThe entered array:");
        System.out.print("  ");

        int cols = t[0].length;
        for (int j = 0; j < cols; j++) {
            System.out.print("   [" +  j + "]");
        }
        System.out.println();
        for (int i = 0; i < t.length; i++) {
            System.out.print(" [" +  i + "]  ");
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] +  "    ");
            }
            System.out.println();
        }


    }// end of method main
}//end of class