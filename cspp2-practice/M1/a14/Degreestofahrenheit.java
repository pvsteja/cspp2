/**
 * Degreestofahrenheit.java.
 * @author tejapathri
 */
public final class Degreestofahrenheit {
    /**
    * main function to print hello friends.
    * Empty constructor
    */
    private Degreestofahrenheit() {

    }
    /**
     *
     * main function.
     * @param args Not used variable.
     */

    public static void main(final String[] args) {
        final float degrees = 1.8f;
        final float celsius = 42.5f;
        final float fahrenheit = (celsius * (degrees)) + 32;
        System.out.println(fahrenheit);
    }
}
