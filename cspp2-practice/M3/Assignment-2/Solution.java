
import java.util.Scanner;
/*
    Do not modify this main function.
    */
/**.
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
/* Fill the main function to print the number of 7's between 1 to n*/
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {

        Scanner s = new Scanner(System.in);
        final int n = s.nextInt();
        final int a = 10;
        final int b = 7;
        occurence(a, b, n);
        System.out.println(occurence(a, b, n));
    }
    /**
     * { function_description }
     *
     * @param      a     { parameter_description }
     * @param      b     { parameter_description }
     * @param      n     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    static int occurence(final int a, final int b, final int n) {
        int temp;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            temp = i;
            while (temp != 0) {
                final int j = temp % a;
                if (j == b) {
                    count += 1;
                }
                temp = temp / a;
            }
        }
        return count;
    }
}
