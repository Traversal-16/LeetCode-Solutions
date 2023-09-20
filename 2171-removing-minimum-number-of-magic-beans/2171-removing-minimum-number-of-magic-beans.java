class Solution 
{
    public long minimumRemoval(int[] beans) 
    {
        Arrays.sort (beans);
        long ans=Long.MAX_VALUE;
        long sum=0;
        for (int i:beans) sum+=i;

        for (int i=0;i<beans.length;i++)
        {
            ans=Math.min (ans, sum-(long)beans[i]*(beans.length-i));
        }
        return ans;    
    }
}