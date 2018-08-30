import java.util.Scanner;
/**
 * Class for average.
 */
public final class Average {
    /**
     * Constructs the object.
     */
    private Average() {
    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        System.out.println(sumOfElements(sum, n));
    }
    /**.
     * { function_description }
     *
     * @param      sum   The sum
     * @param      n     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static int sumOfElements(final int sum, final int n) {
        return (sum / n);
    }
}
