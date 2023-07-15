class Solution 
{
    public int recursion (int events[][],int prev,int ind,int k,int dp[][])
    {
        if (ind>=events.length ||k==0)
        {
            return 0;
        }
        if (prev!=-1 && dp[prev][k]!=-1) return dp[prev][k];
        int c1=0;
        if (prev==-1 || (events[ind][0]>events[prev][1]))
        {
            c1=events[ind][2]+recursion (events,ind,ind+1,k-1,dp);
        }
        int c2=recursion (events,prev,ind+1,k,dp);
       if (prev!=-1)
       {
            return dp[prev][k]=Math.max (c1,c2);
       }
       else
       {
            return Math.max (c1,c2);
       }
    }
    public int maxValue(int[][] events, int k) 
    {
        Arrays.sort (events,new Comparator <int[]>(){
            public int compare (int a[],int b[])
            {
                if (a[0]!=b[0])
                {
                    return a[0]-b[0];
                }
                else if (a[1]!=b[1])
                {
                    return a[1]-b[1];
                }
                else
                {
                    return a[2]-b[2];
                }
            }
        });
        int dp[][]=new int[events.length+1][k+1];
        for (int t[]:dp)
        {
            Arrays.fill (t,-1);
        }
        return recursion (events,-1,0,k,dp);
    }
}