import java.util.*;
import java.io.*;

public class ex{

    public static void main(String args[])
    {
       Scanner s = new Scanner(System.in);
        Vector v = new Vector();
        int n=s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
        }
        int sumf=0;
        int suml=0;
        int sum[] = new int[n];
        for(int i=n-1;i>=0;i--)
        {
            int j=(n-1)-i;
            suml+=arr[i];
            sum[j] = suml;
        }
        for(int i=0;i<n;i++)
        {
            int k=(n-1)-i;
            sumf+=arr[i];
           // System.out.print(sumf+","+sum[i]+"|");
            if(sumf==sum[k])
            {
                v.add(i);
            }
        }
        
        System.out.print(v);
        
    }
}