
import java.util.Scanner;
/*
    Do not modify this main function.
    */
public class power {
/* Fill the main function to print the number of 7's between 1 to n*/
    /**
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        final long x = scan.nextInt();
        final long y = scan.nextInt();
        System.out.println(power(x, y));
    }
        /**
         *
         *
         * @param      x     { parameter_description }
         * @param      y     { parameter_description }
         *
         * @return     { description_of_the_return_value }
         */
        static long power(final long x, final long y) {
            if (y == 0) {
                return 1;
            }
            else if (y == 1) {
                return x;
            }
            else {
                return (x * power(x, (y - 1)));
            }

        }
}
