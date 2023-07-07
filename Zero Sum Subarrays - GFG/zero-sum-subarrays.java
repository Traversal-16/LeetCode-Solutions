//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    int n;
		    n=sc.nextInt();
		    
		    long arr[]=new long[n];
	
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextLong();
		    }
            Solution ob = new Solution();
		    System.out.println(ob.findSubarray(arr,n));
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        //Your code here
        HashMap<Long,Integer> h=new HashMap<>();
        long sum=0;
        long c=0;
        for (int i=0;i<n;i++)
        {
            sum+=arr[i];
            h.put(sum,h.getOrDefault (sum,0)+1);
        }
        Iterator<Long> it=h.keySet ().iterator ();
        while (it.hasNext ())
        {
            long key=it.next();
            int val=h.get (key);
            if (key==0)
            {
                c+=((int)val*(val+1)/2);
            }
            else
            {
                c+=((int)val*(val-1)/2);
            }
        }
        return c;
    }
}