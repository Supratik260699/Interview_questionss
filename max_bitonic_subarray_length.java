import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        while(t>0)
        {
            int n = s.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = s.nextInt();
            }
			int lr[] = new int[n];
			int rl[] = new int[n];
			int countlr=1,countrl=1;
			lr[0] = 1;
            for(int i=1;i<n;i++)
			{
				if(arr[i]>=arr[i-1])
				{
					countlr++;
					lr[i] = countlr;
				} 
				else
				{
					countlr=1;
					lr[i] = countlr;
				}
			}
			rl[n-1]=1;
			for(int j=n-2;j>=0;j--)
			{
				if(arr[j]>=arr[j+1]) 
				{
					countrl++;
					rl[j] = countrl;
				}
				else
				{
					countrl = 1;
					rl[j] = countrl;
				}
			}
			int max=lr[0]+rl[0]-1;
			int ans=lr[0]+rl[0]-1;
			for(int i=1;i<n;i++)
			{
				ans=lr[i]+rl[i]-1;
				if(ans>max)
				{
					max=ans;
				}
			}
            System.out.println(max);
			t--;
        }
    }
        
}