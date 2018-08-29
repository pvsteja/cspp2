import java.util.Scanner;
/**
 * Class for factorial.
 */
public final class Factorial {
    /**
     * Constructs the object.
     */
    private Factorial() {

    }
    /**.
     * { function_description }
     *
     * @param      n     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    static int factorial(final int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        System.out.println(" enter the number for factorial");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int result = 0;
        result = factorial(a);
        System.out.println(result);

    }
}
