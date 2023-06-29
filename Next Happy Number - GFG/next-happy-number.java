//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.nextHappy(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static boolean happy (int N)
    {
        int sum=N;
        if (N==1||N==7) return true;
        while (sum>9)
        {
            int nsum=0;
            while (sum>0)
            {
                nsum+=(int)Math.pow((sum%10),2);
                sum /=10;
            }
            if (nsum==1) return true;
            else
            {
                sum=nsum;
            }
            
        }
        if (sum!=1 && sum!=7) return false;
        return true;
    }

    static int nextHappy(int N)
    {
        // code here
        for (int i=N+1;i<=100003;i++)
        {
            if (happy(i)==true) return i;
        }
        return 1;
    }
}