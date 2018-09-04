import java.util.Scanner;
public class odd {

	public static void main(String[] args) {
		int i = 0; int count = 0;
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (i = 3; i < n; i++) {
			if ( i%2 != 0 ) {
				count = 0;
			}
			for (int j = 3; j < i; j++) {
				if (j%i == 0) {
					count++;
				}
				if (count > 0){
					System.out.println(i);
				}	
				}
			}	
			}
		}