 import java.util.Scanner;

public class Solution {
    /*
    Do not modify this main function.
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        double degreesCelsius = scan.nextDouble();
        degreesCelsiustofahrenheit(degreesCelsius);
    }
    /*
    Need to fill the degreesCelsiustofahrenheit function and print the output
    of fahrenheit.
    */
    public static void degreesCelsiustofahrenheit(final double degreesCelsius) {
        double fahrenheit = (degreesCelsius *9)/5 + 32;
        System.out.println(fahrenheit);
    }
}
