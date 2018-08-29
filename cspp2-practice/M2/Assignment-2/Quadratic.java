import java.util.Scanner;
public class Quadratic {
  /*
  Do not modify this main function.
  */
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double a = scan.nextDouble();
    double b = scan.nextDouble();
    double c = scan.nextDouble();
    Quadratic(a, b, c);
  }
  
  /*
  Need to write the rootsOfQuadraticEquation function and print the output.
  */
      static void Quadratic(double a, double b, double c) {
      double cons =  Math.sqrt(((b * b) - (4 * a * c)));
      double r1 = (-1 * b + cons) / (2 * a);
      double r2 = (-1 * b - cons) / (2 * a);
      System.out.println(r1 + " " + r2);

    }
     


}
