//16.10 (Duplicate Elimination) Write a program that reads in a series of
//first names and eliminates duplicates by storing them in a Set. Allow the
//user to search for a first name.





            import java.util.*;

public class DuplicateEliminate {
    public static void main(String[] args) {
        // create and display a List<String>
        String[] names = new String[10];
        List<String> list = Arrays.asList(names);
        System.out.printf("List before entry: %s%n", list);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter new names seperated by a coma:");
//        List<String> firstnames = Arrays.asList(names);
        String firstnames = input.nextLine();
//
        System.out.printf("List after entry: %s%n",firstnames);

        // eliminate duplicates then print the unique values
        printNonDuplicates(list);
    }


//     create a Set from a Collection to eliminate duplicates
private static void printNonDuplicates(Collection<String> values) {
        // create a HashSet
        Set<String> set = new HashSet<>(values);

        System.out.printf("%nNonduplicates are: ");

        for (String value : set) {
            System.out.printf("%s ", value);
        }

        System.out.println();
    }
}
