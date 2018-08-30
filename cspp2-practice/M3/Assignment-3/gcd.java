import java.util.Scanner;
/*
    Do not modify this main function.
    */
/**
 * Class for gcd.
 */
public class gcd {
    /**
     * Constructs the object.
     */
    private gcd() {

    }
    /**
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {

        Scanner s = new Scanner(System.in);
        int gcd = 0;
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        for (int i = 1; i <= n1; i++) {
            if ((n1 % i) == 0 && (n2 % i) == 0) {
                if (gcd < i) {
                    gcd = i;
                }
            }
        }
        System.out.println(gcd);
    }
    /*
    Need to write the gcd function and print the output.
    */
}

