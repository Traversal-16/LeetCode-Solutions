class Solution 
{
    public double recursion (int A,int B,double dp[][])
    {
        if (A<=0 && B<=0 )
        {
            return 0.5;
        }
        if (A<=0)
        {
            return 1.0;
        }
        
        if (B<=0)
        {
            return 0.0;
        }
        if (dp[A][B]!=-1.0)
        {
            return dp[A][B];
        }
        double prob=recursion (A-100,B,dp)+recursion (A-75,B-25,dp)+recursion (A-50,B-50,dp)+recursion (A-25,B-75,dp);

        return dp[A][B]= (0.25 * prob);
    }
    public double soupServings(int n) 
    {
        if (n>=4000)
        {
            return 1.0;
        }
        double dp [][]=new double [n+1][n+1];
        for (double t[]:dp)
        {
            Arrays.fill (t,-1.0);
        }
        
        return recursion (n,n,dp);   
    }
}