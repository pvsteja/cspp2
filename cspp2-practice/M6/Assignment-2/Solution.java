import java.util.Scanner;
/**
 * Write a java program to round the
 * elements of a matrix to the nearest 100.
 *
 * @author : 
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //not used
    }
    /**
     * Function to round the
     * elements of a matrix to the nearest 100.
     *
     * @param      a     Matrix of which the elements to be rounded
     * @param      rows     Number of rows
     * @param      columns     Number of columns
     *
     * @return     Matrix of the rounded elements
     */
    static int[][] roundHundred(final int[][] a, final int rows, final int columns) {
        final int size = 11, m = 100, mid = 50;
        final int[] mat = new int[size];
        for (int i = 0; i < size; i++) {
            mat[i] = i * m;
        }
        int temp = 0;
        for (int j = 0; j < rows; j++) {
            for (int k = 0; k < rows; k++) {
                for (int i = 0; i < mat.length; i++) {
                    temp = Math.round(a[j][k] - mat[i]);
                    if (temp < mid) {
                        a[j][k] = mat[i];
                        break;
                    }
                    else if (temp == mid) {
                        a[j][k] = mat[i + 1];
                        break;
                    }
                }
            }
        }
        return a;

	}
    /**
     * Main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        int[][] b = roundHundred(a, m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println(b[i][n - 1]);
        }
    }
}
