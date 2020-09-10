//O(n) time complexity
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
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                count++;
            }
        }
        for(int i=0;i<n;i++)
        {
            arr[i] = 1;
        }
        for(int i=0;i<count;i++)
        {
            arr[i] = 0;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+",");
        }
    }
}
