//O(n square) time comp
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
        int sum=0,maxsum=0,max=0;
        for(int st=0;st<n;st++)
        {
            for(int e=st;e<n;e++)
            {
                sum +=arr[e];
              //  System.out.print(sum+" sum ");
                if(arr[e]>max)
                {
                    max = arr[e];
                }
               // System.out.print(max+" max ");
                maxsum = (max*(max+1))/2;
              //  System.out.print(maxsum+" maxsum ");
                if(maxsum-sum==0)
                {
                    System.out.println("From "+st+" to "+e);
                }
            }
            sum=0;
        }
    }
}