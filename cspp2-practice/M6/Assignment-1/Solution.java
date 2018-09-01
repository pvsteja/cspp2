import java.util.Scanner;
/**
 * Write a java program to find the odd composite numbers.
 * between 2 and n where n is given as an input.
 *
 * @author :Muralidhar, 20186065.
 */
public final class Solution {
    /**
    * Empty constructor.
    */
    private Solution() {
        //not used
    }


    /**
     * Is prime checking.
     * @param n passing n for prime check.
     * @return is prime value.
     */

    public static int prime(final int n) {
        int flag = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
              flag += 1;
            }
              }
        if (flag == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * Prints the odd composite numbers between 2 and n.
     *
     * @param      n     n value
     */
    public static void oddComposites(final int n) {
    // write your code here
        final int a = 3;
        for (int i = a; i < n; i++) {
            int p = prime(i);
            if ((i % 2 != 0) && (p == 0)) {
                System.out.println(i);
            }
        }
    }
    /**
    * main method as driver program.
    * @param args is the parameter for this method
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        oddComposites(n);
    }
}


