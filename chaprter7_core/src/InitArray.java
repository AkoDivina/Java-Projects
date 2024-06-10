// // Fig. 7.2: InitArray.java
//         // Initializing the elements of an array to default values of zero.
//
//         public class InitArray {
// public static void main(String[] args) {
//         // declare variable array and initialize it with an array object
//         int[] array = new int[10]; // create the array object
//
//         System.out.printf("%s%8s%n", "Index", "Value"); // column headings10
//         // output each array element's value
//     //%8s gives 8 spaces before the next heading
//         for (int counter = 0; counter < array.length; counter++) { //length is the size of the array
//             System.out.printf("%5d%8d%n", counter, array[counter]);
//             //%8s gives 8 spaces after each counter variable
//             }
//         }
// }
// Fig. 7.3: InitArray.java
         // Initializing the elements of an array with an array initializer.

//         public class InitArray {
// public static void main(String[] args) {
//          // initializer list specifies the initial value for each element
//          int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
//
//          System.out.printf("%s%8s%n", "Index", "Value"); // column headings10
//          // output each array element's value
//          for (int counter = 0; counter < array.length; counter++) {
//              System.out.printf("%5d%8d%n", counter, array[counter]);
//              }
//          }
//}

 // Fig. 7.4: InitArray.java
         // Calculating the values to be placed into the elements of an array.

         public class InitArray {
 public static void main(String[] args) {
        final int ARRAY_LENGTH = 15; // declare constant
         int[] array = new int[ARRAY_LENGTH]; // create array

         // calculate value for each array element
         for (int counter = 0; counter < array.length; counter++) {
             array[counter] = 2 + 2 * counter;
             }

         System.out.printf("%s%8s%n", "Index", "Value"); // column headings15
         // output each array element's value
         for (int counter = 0; counter < array.length; counter++) {
             System.out.printf("%5d%8d%n", counter, array[counter]);
             }
         }
 }
