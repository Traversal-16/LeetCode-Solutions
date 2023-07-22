class Solution 
{
    public double recursion (int n,int k,int row,int col,double dp[][][])
    {
        if (k<0)
        {
            return 1.0;
        }
        if (row<0 || row>=n || col<0 || col>=n)
        {
            return 0.0;
        }
        if (dp[k][row][col]!=-1.0) return dp[k][row][col];
        double ans=0.0;
        for (int i=-2;i<=2;i++)
        {
            for (int j=-2;j<=2;j++)
            {
                if (i==j || i== -j || j== -i || i==0 ||j==0) continue;
                ans+=recursion (n,k-1,row+i,col+j,dp) * (0.125);
            }
        }
        return dp[k][row][col]=ans;
    }
    public double knightProbability(int n, int k, int row, int column) 
    {
        double dp[][][]=new double [k+1][n+1][n+1];
        for (double t1 [][]:dp)
        {
            for (double t2[]:t1)
            {
                Arrays.fill (t2,-1.0);
            }
        }
        return recursion (n,k,row,column,dp);
    }
}