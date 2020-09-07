import java.io.*;
import java.util.*;

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
        int d = s.nextInt();
        int[] temp = new int[d];
        for(int i=0;i<d;i++)
        {
            temp[i] = arr[i];
        }
        for(int i=d;i<n;i++)
        {
            arr[i-d] = arr[i];
        }
        for(int i=0;i<d;i++)
        {
            arr[n-d+i] = temp[i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+",");
        }
    }
}