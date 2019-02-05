import java.util.Scanner;
public class Solution {
	private Solution() {

	}
	public static boolean isodd(int num) {
		return (num%2!=0);
	}
	public static boolean iscomposite(int num) {
		int count = 0;
		for (int i = 1; i <=num; i++) {
			if (num%i==0) {
				count = count + 1;
			}
		}
		if (count > 2) {
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void oddcomposites(int n) {
		for (int i = 1 ; i <=n; i++) {
			if(isodd(i) && iscomposite(i)) {
				System.out.println(i);
			}

		}

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int limit = Integer.parseInt(sc.nextLine());
		oddcomposites(limit);
	}
}