/**
 * Swap.java.
 * @author tejapathri
 */
public final class Swap {
    /**
     * main function to print swapped variables.
     * Empty constructor
     */
    private Swap() {

    }
    /**
     *
     * main function.
     * @param args Not used variable.
     */
    public static void main(final String[] args) {
        int a = 5;
        int b = 6;
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);

    }
}
