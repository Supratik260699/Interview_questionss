//O(n) time comp
//O(1) space comp
import java.util.*;
import java.io.*;


public class ex{
    static int cal(int[] arr,int n)
    {
        int xor=0;
        for(int i=0;i<n;i++)
        {
            xor ^= arr[i];
        }

        for(int i=1;i<=n-1;i++)
        {
            xor ^= i;
        }

        return xor;
    }

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
        }
        System.out.print(cal(arr,n));
    }


    
}