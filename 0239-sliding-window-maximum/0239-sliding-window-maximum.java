class Solution 
{
               /*Brute Force T.C.->O(N*K)  S.C.->O(1)*/
    // public int[] maxSlidingWindow(int[] nums, int k) 
    // {
    //     int res[]=new int [nums.length-k+1];
    //     int u=-1;
    //     for (int i=0;i<nums.length-k+1;i++)
    //     {
    //         int ans=nums[i];
    //         for (int j=1;j<k;j++)
    //         {
    //             ans=Math.max(ans,nums[i+j]);
    //         }
    //         res[++u]=ans;
    //     }
    //     return res;
    // }

                    /*T.C->O(NLOG(K))   S.C->O(K)*/
    // public int[] maxSlidingWindow(int[] nums, int k) 
    // {
    //     int res[]=new int [nums.length-k+1];
    //     PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->(b-a));
    //     for (int i=0;i<k;i++)
    //     {
    //         pq.add (nums[i]);
    //     }
    //     int u=-1;
    //     res[++u]=pq.peek ();
    //     pq.remove (nums[0]);

    //     for (int i=k;i<nums.length;i++)
    //     {
    //         pq.offer (nums[i]);
    //         res[++u]=pq.peek ();
    //         pq.remove (nums[i-k+1]);
    //     }
    //     return res;

    // }

              //T.C->O(2*N)  S.C->O(K)
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
}