//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.distinctSubsequences(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    int distinctSubsequences(String S) 
    {
        // code here
        int memo[]=new int [26];
        Arrays.fill (memo,-1);
        // memo[S.charAt(0)-'a']=0;
        int dp[]=new int [S.length()+1];
        int mod=(int)1e9+7;
        dp[0]=1;
        for (int i=1;i<=S.length();i++)
        {
            dp[i]=(2*dp[i-1])%mod;
            if (memo[S.charAt (i-1)-'a']!=-1)
            {
                dp[i]=dp[i]-dp[memo[S.charAt(i-1)-'a']];
            }
            dp[i] %=mod;
            
            memo[S.charAt(i-1)-'a']=i-1;
        }
        return (dp[S.length()]+mod)%mod;
    }
}