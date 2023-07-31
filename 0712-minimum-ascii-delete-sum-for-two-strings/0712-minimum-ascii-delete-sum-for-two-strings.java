class Solution 
{
    public int recursion (int i,int j,String s1,String s2,int dp[][])
    {
        if (i==s1.length () && j==s2.length ())
        {
            return 0;
        }
        if (dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int ans=Integer.MAX_VALUE;
        if (i==s1.length ())
        {
            ans=Math.min (ans,((int) s2.charAt (j))+recursion (i,j+1,s1,s2,dp));
        }
        else if (j==s2.length ())
        {
            ans=Math.min (ans,((int)s1.charAt (i))+recursion (i+1,j,s1,s2,dp));
        }
        else if (s1.charAt (i)==s2.charAt (j))
        {
            ans=Math.min (ans,recursion (i+1,j+1,s1,s2,dp));
        }
        else
        {
            ans=Math.min (ans,((int)s1.charAt (i))+recursion (i+1,j,s1,s2,dp));
            ans=Math.min (ans,((int)s2.charAt (j))+recursion (i,j+1,s1,s2,dp));
        }
        return dp[i][j]=ans;
    }
    public int minimumDeleteSum(String s1, String s2)
    {
        int dp[][]=new int [s1.length ()+1][s2.length ()+1];
        for (int t[]:dp)
        {
            Arrays.fill (t,-1);
        }
        return recursion (0,0,s1,s2,dp);
    }
}