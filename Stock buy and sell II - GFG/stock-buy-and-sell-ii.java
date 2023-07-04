//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] prices = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.stockBuyAndSell(n, prices);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends



class Solution {
    public static int recursion (int prices[],int i,boolean flag,int dp[][])
    {
        if (i==prices.length) return 0;
        if (flag==false && dp[i][0]!=-1) return dp[i][0];
        if (flag==true && dp[i][1]!=-1) return dp[i][1];
        
        int ans1=0,ans2=0;
        if (flag==true)
        {
            ans1 =-prices[i]+recursion (prices,i+1,!flag,dp);
        }
        else
        {
            ans2=prices[i]+recursion (prices,i+1,!flag,dp);
        }
        int ans3=recursion (prices,i+1,flag,dp);
        
        if (flag==false)
        {
            return dp[i][0]=Math.max (ans1,Math.max (ans2,ans3));
        }
        else
        {
            return dp[i][1]=Math.max (ans1,Math.max (ans2,ans3));
        }
        
    }
    public static int stockBuyAndSell(int n, int[] prices) 
    {
        // code here
        int dp[][]=new int [n][2];
        for (int t[]:dp) Arrays.fill (t,-1);
        return recursion (prices,0,true,dp);
    }
}
        
