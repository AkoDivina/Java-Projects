// Fig. 23.29: SortComparison.java
// Comparing performance of Arrays methods sort and parallelSort.
//. To create the 100,000,000 element array in this example, we used Random rather than
//    SecureRandom, because Random executes significantly faster.

import java.time.Duration;
import java.time.Instant;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Random;

public class SortComparison {

    public static void main(String[] args) {
        Random random = new Random();

        // create array of random ints, then copy it
        int[] array1 = random.ints(100_000_000).toArray();
        int[] array2 = array1.clone();

        // time the sorting of array1 with Arrays method sort
        System.out.println("Starting sort");
        Instant sortStart = Instant.now();
        Arrays.sort(array1);
        Instant sortEnd = Instant.now();

        // display timing results
        long sortTime = Duration.between(sortStart, sortEnd).toMillis();
        System.out.printf("Total time in milliseconds: %d%n%n", sortTime);

        // time the sorting of array2 with Arrays method parallelSort
        System.out.println("Starting parallelSort");
        Instant parallelSortStart = Instant.now();
        Arrays.parallelSort(array2);
        Instant parallelSortEnd = Instant.now();

        // display timing results
        long parallelSortTime =
                 Duration.between(parallelSortStart, parallelSortEnd).toMillis();
        System.out.printf("Total time in milliseconds: %d%n%n",
                parallelSortTime);

        // display time difference as a percentage
        String percentage = NumberFormat.getPercentInstance().format(
                (double) (sortTime - parallelSortTime) / parallelSortTime);
        System.out.printf("sort took %s more time than parallelSort%n",
                percentage);
    }
}