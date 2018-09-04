import java.util.Scanner;
public class matrix 
{
	public static void main(String[] args) {
		int[][] m1, m2, product;
		int a,b,c,d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the matrix");
		a = sc.nextInt();
		b = sc.nextInt();
		m1 = new int[a][b];
		for (int i = 0; i < a; i++) {
			for (int j =0; j < b; j++) {
				m1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the size of the matrix");
		c = sc.nextInt();
		d = sc.nextInt();
		m2 = new int[c][d];
		for (int i = 0; i < c; i++) {
			for (int j =0; j < d; j++) {
				m2[i][j] = sc.nextInt();
			}
		}
		if (b == c) {
			product = new int[a][d];
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < d; j++) {
					for (int k =0; k < b; k++) {
						product[i][j] += m1[i][k] * m2[k][j];
					}
				}
			}
			for (int i =0; i < a; i++) {
				for (int j = 0; j < d; j++) {
					System.out.print(product[i][j]);
					if (j < d-1) {
						System.out.print(" ");
					}
				}
				System.out.println("");
			}
		}else {
			System.out.println("Matrix multiplication not possible");
		}
	}
}