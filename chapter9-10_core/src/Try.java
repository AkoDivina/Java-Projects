        import java.util.Scanner;

        public class Try {

            public static int divide(int numerator, int denominator) {
                return numerator / denominator;
            }

            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.println("Enter an integer");
                int num = input.nextInt();

                System.out.println("Enter another integer");
                int deno = input.nextInt();


                int result = divide(num, deno);
                System.out.printf(" %d / %d = %d", num, deno, result);
            }
        }
        //class
