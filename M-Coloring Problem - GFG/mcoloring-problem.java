//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tc = scan.nextInt();

        while (tc-- > 0) {
            int N = scan.nextInt();
            int M = scan.nextInt();
            int E = scan.nextInt();

            boolean graph[][] = new boolean[N][N];

            for (int i = 0; i < E; i++) {
                int u = scan.nextInt() - 1;
                int v = scan.nextInt() - 1;
                graph[u][v] = true;
                graph[v][u] = true;
            }

            System.out.println(new solve().graphColoring(graph, M, N) ? 1 : 0);
        }
    }
}

// } Driver Code Ends


class solve {
    // Function to determine if graph can be coloured with at most M colours
    // such
    // that no two adjacent vertices of graph are coloured with same colour
    public boolean safe (int node,ArrayList<ArrayList<Integer>> adj,int color[],int col)
    {
        for (int j:adj.get(node))
        {
            if (color[j]==col) return false;
        }
        return true;
    }
    public boolean solve (int i,ArrayList<ArrayList<Integer>> adj,int color[],int m,int n)
    {
        if (i==n) return true;
        
        for (int col=1;col<=m;col++)
        {
            if (safe(i,adj,color,col)==true)
            {
                color[i]=col;
                
                if (solve(i+1,adj,color,m,n)==true) return true;
                color[i]=0;
            }
        }
        return false;
    }
    public boolean graphColoring(boolean graph[][], int m, int n) {
        // Your code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList <>();
        for (int i=0;i<n;i++)
        {
            adj.add (new ArrayList <>());
        }
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                if (graph[i][j]==true)
                {
                    adj.get (i).add(j);
                    adj.get (j).add(i);
                }
            }
        }
        
        int color[]=new int [n];
        for (int i=0;i<n;i++)
        {
            if (solve(i,adj,color,m,n)==false) return false;
        }
        return true;
    }
}