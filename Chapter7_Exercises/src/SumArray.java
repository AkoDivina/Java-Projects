import java.security.SecureRandom;

public class SumArray {

    public static void main(String[] args) {

        int[] f = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.printf("%d is the element is index 6", f[6]);
        System.out.println();
        for (int i = 0; i < f.length; i++) {
            f[i] = 8;
            System.out.printf("%d%n%n numbers in array f are", f[i]);
        }


        SecureRandom random = new SecureRandom();
//        int[] c = new int[]{random.nextInt(100)}; // 0 to 99 (inclusive)
        int[] c = new int[100];
        float sum = 0.0f;
        for (int a = 0; a < c.length; a++) {
            c[a] = random.nextInt(100);
            System.out.printf("%d%n numbers in array c are : ", c[a]);

            sum += c[a];

        }


        System.out.printf("Total sum = %f%n ",  sum);
//
//Copy 11-element array a[] into the first portion of array b, which
//contains 34 elements.
        int[] b = new int[34];
        int[] a = new int [11];
        a[10] = random.nextInt(10);
        b[0] = a[10];
        System.out.printf("%n the element of array b[0] is : %d%n", b[0]);

//Determine and display the smallest and largest values contained
//in 99-element floating-point array w

        float[] w = new float[99];

        float small = w[0];
        for(int i=0; i<w.length; i++){
            w[i] = random.nextInt(100);
            System.out.printf("%f%n", w[i]);
            if (small<w[i]){
                w[0] = small;

            }
            else
                small = w[i];
//            System.out.printf("%f%n", small);
        }
        System.out.printf("the smallest number is %f%n", small);
        float large= w[0];
        for(int i=0; i<w.length; i++) {
//            w[i] = random.nextFloat(100);
            if (large > w[i]) {
                w[0] = large;

            } else {
                large = w[i];
//                System.out.printf("the largest number is %f%n", large);
            }

        }
        System.out.printf("the largest number is %f%n", large);
    }//end of method
}//end of class