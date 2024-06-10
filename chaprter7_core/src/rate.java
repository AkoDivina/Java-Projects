//Twenty students were asked to rate on a scale of 1 to 5 the
//quality of the food in the student cafeteria, with 1 being
//“awful” and 5 being “excellent.” Place the 20 responses in an
//integer array and determine the frequency of each rating.

public class rate{
    public static void main(String[] args){
//        int[] array = new int[20];
        int array[] =  {2,1,1,2,3,4,2,4,3,2,4,5,3,2,3,4,2,5,2,3};
        System.out.printf("%s%8s%n", "Students", "Rating");
        for (int taste = 0; taste < array.length; taste++ ){
System.out.printf("%s%8s%n", taste, array[taste] );

        }

        System.out.printf("%s%10s%n", "Rating", "Frequency");

    }
}