class Solution 
{
    int dirs[][]={{0,1},{0,-1},{1,0},{-1,0}};
    public boolean dfs (int grid[][],int i,int j,boolean vis[][])
    {
        if (i>=grid.length || j>=grid[0].length) return false;
        if (i==grid.length-1) return true;

        vis[i][j]=true;
        boolean ans=false;
        for (int dir[]:dirs)
        {
            int nr=i+dir[0];
            int nc=j+dir[1];
            if (nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length &&vis[nr][nc]==false && grid[nr][nc]==0)
            {
               ans=(ans || dfs(grid,nr,nc,vis));
            }
        }
        return ans;

    }
    public boolean check (int row,int col,int cells[][],int mid)
    {
        int grid[][]=new int [row][col];
        for (int i=0;i<=mid;i++)
        {
            grid[cells[i][0]-1][cells[i][1]-1]=1;
        }
        for (int i=0;i<col;i++)
        {
            boolean vis[][]=new boolean [row][col];
            if (grid[0][i]==0 && dfs(grid,0,i,vis)==true)
            {
                return true;
            }
        }
        return false;
    }
    public int latestDayToCross(int row, int col, int[][] cells) 
    {
        int ans=-1;
        int low=0;
        int high=cells.length-1;
        while (low<=high)
        {
            int mid=(int)(low+high)/2;
            if (check(row,col,cells,mid)==true)
            {
                ans=mid;
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return ans+1;
        
    }
}