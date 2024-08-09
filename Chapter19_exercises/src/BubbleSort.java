
//    exercise 19.5 Bubble sort

    public class BubbleSort {
        public static void main(String[] args) {
            System.out.println("Array before sorting is: ");

            int[] bubble = new int[]{6, 4, 2, 7, 3, 1, 9, 8, 5};
//            System.out.println("Array after sorting is: ");

            bubbleSort(bubble);

            for (int i : bubble) {
                System.out.print(i);
            }
        }

        public static void bubbleSort(int array[]) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - i - 1; j++) {

                    if (array[j] > array[j+1]) {
                         int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;


                    }
                }
            }
        }
    }





