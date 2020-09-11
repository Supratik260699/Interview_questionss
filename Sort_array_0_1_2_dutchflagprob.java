//O(n) time compl
//O(1) aux space

import java.util.*;
import java.io.*;

class ex{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
        }
        int p=0,bp=0,ap=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                bp++;
            }
            else if(arr[i]==1)
            {
                p++;
            }
            else{
                ap++;
            }
        }
        for(int i=0;i<n;i++)
        {
            arr[i] = 1;
        }
        for(int i=0;i<bp;i++)
        {
            arr[i] = 0;
        }
        for(int i=n-1;i>=ap;i--)
        {
            arr[i] = 2;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+",");
        }
    }
}