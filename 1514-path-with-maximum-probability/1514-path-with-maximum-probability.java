class Pair 
{
    int f;
    double s;
    Pair (int a,double b)
    {
        f=a;
        s=b;
    }
}
class Solution 
{
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) 
    {
        List<List<Pair>> adj=new ArrayList<>();
        for (int i=0;i<n;i++)
        {
            adj.add (new ArrayList <>());
        }   
        for (int i=0;i<edges.length;i++)
        {
            adj.get (edges[i][0]).add(new Pair (edges[i][1],succProb[i]));
            adj.get (edges[i][1]).add(new Pair (edges[i][0],succProb[i]));
        }

        double dis[]=new double [n];
        Arrays.fill (dis,0.00);
        dis[start]=1.0;

        Queue<Integer> queue=new LinkedList <>();
        queue.offer (start);
        while (!queue.isEmpty ())
        {
            int k=queue.poll ();
            for (Pair p:adj.get(k))
            {
                int node=p.f;
                double prob=p.s;
                double newprob=prob*dis[k];
                if (newprob>dis[node])
                {
                    dis[node]=newprob;
                    queue.offer(node);
                }
            }
        }
        // if (dis[end]==1.0)
        // return 0.00;
        return dis[end];
    }
}