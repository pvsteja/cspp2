
import java.util.Scanner;
public class spiral
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the number of rows and number of columns");
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        int m = Integer.parseInt(s.nextLine());
        int i;
        int j;
        int[][] arr = new int[n][m];
        for (i =0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                arr[i][j]=s.nextInt();
            }
            System.out.println();
        }
        for(i =0;i<n;i++)
        {
            for(j=m-1;j>=0;j--)
            {
                System.out.print(arr[i][j]);
                if(j==0)
                {
                    break;
                }
            }
            break;
        }
        for(i=1;i<n;i++)
        {
                System.out.print(arr[i][0]);
        }
        for(j=1;j<m;j++)
        {
            System.out.print(arr[n-1][j]);
        }
        for(i=1;i<n;i++)
        {
          for(j=m-1;j>=m-2;j--)
          {
            System.out.print(arr[i][j]);
            if(j==m-2)
            {
                break;
            }
          }
          break;
        }
        }
            


    }
