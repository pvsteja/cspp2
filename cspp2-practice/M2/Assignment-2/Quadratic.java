import java.util.Scanner;
/**.
 * { item_description }
 */
public final class Quadratic {
  /**.
   * Constructs the object.
   */
  private Quadratic() {

  }
  /*
  Do not modify this main function.
  */
  /**.
   * { function_description }
   *
   * @param      args  The arguments
   */
  public static void main(final String[] args) {
    Scanner scan = new Scanner(System.in);
    final double a = scan.nextDouble();
    final double b = scan.nextDouble();
    final double c = scan.nextDouble();
    cons(a, b, c);
  }
  /*
  Need to write the rootsOfQuadraticEquation function and print the output.
  */
    /**.
     * { function_description }
     *
     * @param      a     { parameter_description }
     * @param      b     { parameter_description }
     * @param      c     { parameter_description }
     */
    static void cons(final double a, final double b, final double c) {

      final int r = 4;
      double cons =  Math.sqrt((b * b) - (r * a * c));
      double r1 = (-1 * b + cons) / (2 * a);
      double r2 = (-1 * b - cons) / (2 * a);
      System.out.println(r1 + " " + r2);
    }
}



