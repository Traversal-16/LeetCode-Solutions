//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to find the number of islands.
    int dirs[][]={{0,1},{0,-1},{1,0},{-1,0},{1,1},{-1,1},{1,-1},{-1,-1}};
    public void dfs (char grid[][],int i,int j,boolean vis[][])
    {
        vis[i][j]=true;
        for (int dir[]:dirs)
        {
            int nr=i+dir[0];
            int nc=j+dir[1];
            if (nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length && vis[nr][nc]==false && grid[nr][nc]=='1')
            {
                dfs (grid,nr,nc,vis);
            }
        }
    }
    public int numIslands(char[][] grid) 
    {
        // Code here
        int count=0;
        boolean vis[][]=new boolean [grid.length][grid[0].length];
        for (int i=0;i<grid.length;i++)
        {
            for (int j=0;j<grid[0].length;j++)
            {
                if (grid[i][j]=='1' && vis[i][j]==false)
                {
                    count++;
                    dfs (grid,i,j,vis);
                    
                }
            }
        }
        return count;
    }
}