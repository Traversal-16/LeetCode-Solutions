class Solution 
{
    // public int square (char matrix[][],int i,int j,int dp[][])
    // {
    //     if (i>=matrix.length || j>=matrix[0].length) return 0;
    //     if (dp[i][j]!=-1) return dp[i][j];
        
    //     int right=square(matrix,i,j+1,dp);
    //     int down=square (matrix,i+1,j,dp);
    //     int diag=square (matrix,i+1,j+1,dp);
    //     if (matrix[i][j]=='1')
    //     {
    //         int ans=1+Math.min (right,Math.min (down,diag));
    //         maxi=Math.max (maxi,ans);
    //         return dp[i][j]=ans;
    //     }
    //     else
    //     {
    //         return dp[i][j]=0;
    //     }
    // }
    // int maxi=0;
    // public int maximalSquare(char[][] matrix) 
    // {
    //     int dp[][]=new int[matrix.length][matrix[0].length];
    //     for (int t[]:dp) Arrays.fill (t,-1);
        
    //     square (matrix,0,0,dp);
    //     return maxi*maxi;
        
    // }


    public int maximalSquare(char[][] matrix) 
    {
        int dp[][]=new int[matrix.length+1][matrix[0].length+1];
        int count=0;
        for (int i=matrix.length-1;i>=0;i--)
        {
            for (int j=matrix[0].length-1;j>=0;j--)
            {
                int right=dp[i+1][j];
                int down=dp[i][j+1];
                int diag=dp[i+1][j+1];
                if (matrix[i][j]=='1')
                {
                    int ans=1+Math.min (right,Math.min (down,diag));
                    count=Math.max(count,ans);
                    dp[i][j]=ans;
                }
                else
                {
                    dp[i][j]=0;
                }
            }
        }
        return count*count;
    }
}