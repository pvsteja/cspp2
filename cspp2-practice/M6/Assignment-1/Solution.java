import java.util.Scanner;
/**
 * Write a java program to find the odd composite numbers
 * between 2 and n where n is given as an input.
 *
 * @author :
 */
public final class Solution {
    /**
    * Empty constructor.
    */
    private Solution() {
        //not used
    }
    /**
     * Prints the odd composite numbers between 2 and n.
     *
     * @param      n     n value
     */
    static void oddComposites(final int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            int factors = 0;
            if ( i % 2 == 0 ) {
                count = 0;
            }else {
                for (int j = 1; j < i; j++) {
                if (j % i == 0) {
                    count++;
                }

            }

            if (factors > 2) {
                System.out.println(i);
            }
            }
        }
;
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

