class Solution 
{
    int ans=Integer.MIN_VALUE;
    public void recursion (int requests[][],int reqNo,int netChangeArray[],int achieved_req)
    {
        if (reqNo==requests.length)
        {
            for (int i=0;i<netChangeArray.length;i++)
            {
                if (netChangeArray[i]!=0) return;
            }
            ans=Math.max (ans,achieved_req);
            return;
        }


        int from =requests[reqNo][0];
        int to=requests[reqNo][1];

        netChangeArray[from]--;
        netChangeArray[to]++;
        recursion (requests,reqNo+1,netChangeArray,achieved_req+1);

        netChangeArray[from]++;
        netChangeArray[to]--;
        recursion (requests,reqNo+1,netChangeArray,achieved_req);
    }
    public int maximumRequests(int n, int[][] requests) 
    {
        int netChangeArray []=new int [n];
        recursion (requests,0,netChangeArray,0);
        return ans;
        
    }
}