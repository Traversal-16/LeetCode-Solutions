class Solution 
{
     public int[] maxSlidingWindow(int[] a, int k) 
    {
        int n=a.length;
        int r[] = new int[n-k+1];
        int ri = 0;
        ArrayDeque<Integer> q = new ArrayDeque<>();

        for(int i=0;i<n;i++)
        {
            while(!q.isEmpty() && q.peek()==i-k){
                q.poll();
            }
            while(!q.isEmpty() && a[q.peekLast()]<=a[i]){
                q.pollLast();
            }
            q.offer(i);
            if(i>=k-1){
                r[ri++]=a[q.peek()];
            }
        }
        return r;
    }
    public boolean check (int chargeTimes[],int runningCosts[],long budget,int consecutive)
    {
        int n=chargeTimes.length;
        // int max[]=new int [n-consecutive+1];
        long sum[]=new long [n-consecutive+1];
        // max[0]=Integer.MIN_VALUE;
        long first=0;
        for (int i=0;i<consecutive;i++)
        {
            // max[0]=Math.max (max[0],chargeTimes[i]);
            first+=runningCosts[i];
        }
        sum[0]=first;
        int u=1;
        for (int i=consecutive;i<n;i++)
        {
            // max[u]=Math.max (max[u-1],chargeTimes[i]);
            sum[u]=runningCosts[i]+sum[u-1]-runningCosts[i-consecutive];
            u++;
        }
        int max[]=maxSlidingWindow (chargeTimes,consecutive);
        for (int i=0;i<max.length;i++)
        {
            long an=max[i]+consecutive*sum[i];
            if (an<=budget)
            {
                return true;
            }
        }
        return false;

    }
    //TIME COMPLEXITY ->O(3*NlogN)
    //Space Complexity ->O ()
    public int maximumRobots(int[] chargeTimes, int[] runningCosts, long budget) 
    {
        int low=1;
        int high=chargeTimes.length;
        int ans=-1;
        while (low<=high)
        {
            int mid=(int)(low+high)/2;
            if (check(chargeTimes,runningCosts,budget,mid)==true)
            {
                ans=mid;
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return (ans==-1)?0:ans;
        
    }
}