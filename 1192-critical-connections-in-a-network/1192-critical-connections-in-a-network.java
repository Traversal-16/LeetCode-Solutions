class Solution 
{
    int timer=1;
    public void dfs (int node,int parent,List<List<Integer>> adj,List<List<Integer>> bridges,int tin[],int low[],boolean vis[])
    {
        vis[node]=true;
        tin[node]=low[node]=timer;
        timer++;
        for (int it:adj.get (node))
        {
            if (it==parent) continue;
            else if (vis[it]==false)
            {
                dfs (it,node,adj,bridges,tin,low,vis);
                low[node]=Math.min (low[node],low[it]);
                if (low[it]> tin[node])
                {
                    bridges.add (Arrays.asList (node,it));
                }
            }
                else
                {
                    low[node]=Math.min (low[node],low[it]);
                }
        }
    }
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) 
    {
        List<List<Integer>> bridges=new ArrayList <>();
        int tin[]=new int [n];
        int low[]=new int [n];
        boolean vis[]=new boolean [n];
        List<List<Integer>> adj=new ArrayList <>();
        for (int i=0;i<n;i++)
        {
            adj.add (new ArrayList <>());
        }
        for (int i=0;i<connections.size();i++)
        {
            adj.get(connections.get(i).get(0)).add(connections.get(i).get(1));
            adj.get(connections.get(i).get(1)).add(connections.get(i).get(0));
        }
        for (int i=0;i<n;i++)
        {
            if (vis[i]==false)
            {
                dfs (0,-1,adj,bridges,tin,low,vis);
            }
        }
        return bridges;
        
    }
}