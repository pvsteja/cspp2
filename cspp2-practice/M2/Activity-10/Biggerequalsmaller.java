import java.util.Scanner;
/**.
 * Class for bigger equal smaller.
 */
public final class Biggerequalsmaller {
    private Biggerequalsmaller() {
        
    }
    /**.
     * { function_description }
     *
     * @param      x     { parameter_description }
     * @param      y     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    static int compare(final int x, final int y) {
        if (x > y) {
            return (x);
        } else if (x == y) {
            return (x);
        } else {
            return (y);
        }

    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        final int x = s.nextInt();
        final int y = s.nextInt();
        final int res = 0;
        System.out.println(compare(x, y));
    }
}
