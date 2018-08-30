import java.util.Scanner;
/**
 * Class for first last 6.
 */
public final class FirstLast6 {
    /**
     * Constructs the object.
     */
    private FirstLast6() {

    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the string");
        final int n = Sc.nextInt();
        final int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = Sc.nextInt();
        }
        System.out.println(occurSixAtLastFirst(arr));
    }
    /**.
     * { function_description }
     *
     * @param      arr   The arr
     *
     * @return     { description_of_the_return_value }
     */
    public static boolean occurSixAtLastFirst(final int[] arr) {
        return (arr[0] == six) || (arr[arr.length - 1] == six);
    }
}
