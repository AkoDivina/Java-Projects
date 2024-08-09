// Fig. 14.4: StringStartEnd.java
// String methods startsWith and endsWith.

         public class StringStartEnd {
 public static void main(String[] args) {
         String[] strings = {"started", "starting", "ended", "ending"};

         // test method startsWith
//     for(int count =0; count <= 0; count++){
        for (String name : strings) {  // enhanced for loops are best for Strings
             if (name.startsWith("st")) {
                 System.out.printf("\"%s\" starts with \"st\"%n",name);
                 }
             }

         System.out.println();

         // test method startsWith starting from position 2 of string
         for (String string : strings) {
             if (string.startsWith("art", 2)) {
                 System.out.printf(
                         "\"%s\" starts with \"art\" at position 2%n", string);
                 }
             }

         System.out.println();

         // test method endsWith
         for (String string : strings) {
             if (string.endsWith("ed")) {
                System.out.printf("\"%s\" ends with \"ed\"%n", string);
                }
             }
         }
 }