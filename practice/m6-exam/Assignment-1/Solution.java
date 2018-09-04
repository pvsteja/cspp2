import java.util.Scanner;
/**
 * Write a java program to find the odd composite numbers
 * between 2 and n where n is given as an input.
 *
 * @author : MurthyVemuri
 */
public final class Solution {
    /**
    * Empty constructor.
    */
    private Solution() {
        //not used
    }

    /**
     * Determines if composite.
     *
     * @param      n     { parameter_description }
     *
     * @return     True if composite, False otherwise.
     */
    public static boolean isComposite(final int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            for (int i = 1 + 2; i < n; i++) {
                if (n % i == 0) {
                    return true;
                }
            }
            return false;
        }
    }
    /**
     * Prints the odd composite numbers between 2 and n.
     *
     * @param      n     n value
     */
    public static void oddComposites(final int n) {
        for (int i = 1; i < n; i += 2) {
            if (isComposite(i)) {
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

