/**
 * Quotientremainder.java.
 * @author tejapathri
 */
public final class Quotientremainder {
    /**
     * main function to print hello friends.
     * Empty constructor
     */
    private Quotientremainder() {

    }
    /**
     *
     * main function.
     * @param args Not used variable.
     */
    public static void main(final String[] args) {
        int a = 189;
        int b = 10;
        int rem;
        int quo;
        rem = a % b;
        quo = a / b;
        System.out.println(rem + " " + quo);
    }
}
