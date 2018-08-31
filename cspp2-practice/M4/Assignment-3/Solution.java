
// Given an String, Write a java method that returns the decimal value for the given binary string.


import java.util.Scanner;
public class Solution {
/*
	Do not modify this main function.
	*/
	public static void main(final String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=0;i<n;i++){
			String s=sc.next();
			int res=binaryToDecimal(s);//Write binaryToDecimal function
			System.out.println(res);
		}
	}
	/**
	 * { function_description }
	 *
	 * @return     { description_of_the_return_value }
	 */
	public static int binaryToDecimal(final String s) {
		int k = s.length() - 1;
		int res = 0;
		for (int i = 0; i <= s.length() - 1; i++) {
			if (s.charAt(i) == '1') {
				res += Math.pow(2, k);
			}
			k = k - 1;
		}
		return res;

	}
}
