//O(n square) time complexity
//O(1) auxilary space
import java.util.*;
import java.io.*;

public class ex{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
        }
        int sum=0;
        for(int st=0;st<n;st++)
        {
            for(int e=st;e<n;e++)
            {
                sum +=arr[e];
                if(sum==0)
                {
                    System.out.print("["+arr[st]+".."+arr[e]+"]");
                }
            }
            sum=0;
        }
    }
}
