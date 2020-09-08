import java.util.*;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

class ex{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        Map<Integer,Integer> map = new HashMap<>();
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
        }
        int d = s.nextInt();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(d-arr[i]))
            {
                System.out.println(map.get(arr[d-arr[i]])+","+arr[i]);
                return;
            }
            map.put(arr[i],i);
        }
    }
}