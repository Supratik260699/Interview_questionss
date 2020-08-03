import java.util.*;
import java.io.*;
class Prog
{
    static int Dyprog(int arr[],int n) //method
    {
        int dp[][] = new int[n][n];
        int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    dp[i][j]=0;
                }
                else
                {
                    dp[i][j] = arr[i]*arr[j];
                }
                if(dp[i][j]>max)
                {
                    max=dp[i][j];
                }

            }
        }
        return max;
    }
}

public class ex{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        Prog my = new Prog();
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
        }
        System.out.print(Prog.Dyprog(arr,n));
    }
}
