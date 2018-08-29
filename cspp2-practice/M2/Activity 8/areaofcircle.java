import java.util.Scanner;
/**.
 * { item_description }
 */
final class Areacircle {
    /**.
     * Constructs the object.
     */
    private areaofcircle() {
    }
    /**
     *
     * main function.
     * @param args Not used variable.
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        final double r = scan.nextDouble();
        final double area = areaofcircle(r);
        System.out.println(area);
    }
    /**.
     * { function_description }
     *
     * @param      r     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static double areaofcircle(final double r) {
        return pi() * r * r;
    }
    /**.
     * { function_description }
     *
     * @return    { pi }
     */
    public static double pi() {
        final double pi = 3.14;
        return pi;
    }
}
