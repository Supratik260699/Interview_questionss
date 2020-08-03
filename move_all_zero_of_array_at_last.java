import java.util.*;
import java.io.*;

public class ex{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
        }
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[k++] = arr[i];
            }
        }
        for(int i=k;i<n;i++)
        {
            arr[i] = 0;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}