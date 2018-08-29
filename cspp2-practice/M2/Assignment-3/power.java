
import java.util.Scanner;
/*
    Do not modify this main function.
    */
public class power {
/* Fill the main function to print the number of 7's between 1 to n*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println(power(x, y));
    }
        static int power(int x, int y){
            if (y == 0)
                return 1;
            else if (y == 1)
                return x;
            else 
                return (x * power(x, (y-1)));

        }
}