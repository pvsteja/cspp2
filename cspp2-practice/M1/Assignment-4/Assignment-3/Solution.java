/**
 * Solution.java.
 * @author tejapathri
 */
 import java.util.Scanner;

public final class Solution {
    /**
    *Constructor.
    */
    private Solution() {
    }
    /**
    *Do not modify this main function.
    *@param args variable
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        double degreesCelsius = scan.nextDouble();
        degreesCelsiustofahrenheit(degreesCelsius);
    }
    /**
    *Need to fill the degreesCelsiustofahrenheit function and print the output
    *of fahrenheit.
    * @param degreesCelsius variable
    */
    public static void degreesCelsiustofahrenheit(final double degreesCelsius) {
        final double fahrenheit = (degreesCelsius * 9) / 5 + 32;
        System.out.println(fahrenheit);
    }
}
