class Solution 
{
    int dirs[][]={{1,0},{-1,0},{0,1},{0,-1}};
    public boolean check (int grid[][],int i,int j,int elevation,boolean vis[][])
    {
        if (i==grid.length-1 && j==grid[0].length-1)
        {
            return true;
        }
        vis[i][j]=true;
        boolean ans=false;
        for (int dir[]:dirs)
        {
            int nr=i+dir[0];
            int nc=j+dir[1];
            if (nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length && grid[i][j]<=elevation &&grid[nr][nc]<=elevation && vis[nr][nc]==false)
            {
                ans=ans|| (check (grid,nr,nc,elevation,vis));
            }
        }
        return ans;
    }
    public int swimInWater(int[][] grid) 
    {
        int high=0;
        int ans=0;
        for (int i=0;i<grid.length;i++)
        {
            for (int j=0;j<grid[0].length;j++)
            {
                high=Math.max (high,grid[i][j]);
            }
        }
        // high=high-grid[0][0];
        int low=0;
        while (low<=high)
        {
            int mid=(int)(low+high)/2;
            boolean vis[][]=new boolean [grid.length][grid[0].length];
            if (check (grid,0,0,mid,vis)==true)
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
}