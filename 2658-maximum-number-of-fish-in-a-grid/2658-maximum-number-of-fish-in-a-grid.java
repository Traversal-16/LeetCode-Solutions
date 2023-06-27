class Solution 
{
    int array[][]={{0,1},{0,-1},{1,0},{-1,0}};
    public int dfs (int grid[][],int i,int j,boolean vis[][])
    {
        vis[i][j]=true;
        int ans=grid[i][j];
        for (int []dir:array)
        {
            int nr=i+dir[0];
            int nc=j+dir[1];
            if (nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length && vis[nr][nc]==false && grid[nr][nc]!=0)
            {
                ans+=dfs (grid,nr,nc,vis);
            }
        }
        return ans;
    }
    public int findMaxFish(int[][] grid) 
    {
        boolean vis[][]=new boolean [grid.length][grid[0].length];
        int ans=0;
        for (int i=0;i<grid.length;i++)
        {
            for (int j=0;j<grid[0].length;j++)
            {
                if (grid[i][j]!=0 && vis[i][j]==false)
                {
                    // System.out.println (i+"  "+j+"  "+ans);
                    ans=Math.max(ans,dfs(grid,i,j,vis));
                }
            }
        }
        return ans;
        
    }
}