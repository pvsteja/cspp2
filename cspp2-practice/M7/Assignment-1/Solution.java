/**
 *@author : pvsteja.
 */
import java.util.Scanner;
/**
 * class declaration.
 **/
    final class InputValidator {
        /**.
           Declaring a string.
        **/
        private String strCheck;
        /**.
           Declaring string length
        **/
        private int len;
        /**
         * @param strCheck1 string input.
         **/
        InputValidator(final String strCheck1) {
        strCheck = strCheck1;
        len = strCheck.length();
        }
        /**
         * @return true or false.
         **/
        public boolean validateData() {
    final int b = 6;
    if (len >= b) {
        return true;
    }
    return false;
}
}
/**
 main class function.
 **/
final class Solution {
    /**
     constructor.
     **/
    private Solution() { }
    /**.
     * @param args input string.
     **/
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());
    }
}
