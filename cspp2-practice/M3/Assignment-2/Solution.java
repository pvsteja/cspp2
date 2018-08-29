
import java.util.Scanner;
/*
	Do not modify this main function.
	*/
public class Solution {
/* Fill the main function to print the number of 7's between 1 to n*/
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);      
        final int n = s.nextInt();
        final int a = 10;
        final int b = 7;
        occurence(a, b, n);
        System.out.println(occurence(a, b, n));
    }
    static int occurence(int a, int b, int n) {
    	int temp;
    	int count =0;
    	for (int i = 1; i <= n; i ++) {
    		temp = i;
    		while (temp != 0) {
    			final int j = temp % a;
    			if (j == b) {
    				count += 1;
    			}
    			temp = temp / a;
    		}
    	}
    	return count;
    }
}