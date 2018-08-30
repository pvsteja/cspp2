import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {
    /*
    Fill this main function to print maximum of given array
    */
    /**
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a;
        a = new int[n];
        for(int j = 0; j<n;j++) {
            a[j] = sc.nextInt();
        }
        int largest = a[0];
        int i;
        for(i = 1; i < n; i++) {
            if (largest < a[i]) {
                largest = a[i];
            }
        }
        System.out.println(largest);
    }
}
