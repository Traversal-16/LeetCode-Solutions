class Solution 
{
    //T.C->O(NlogN)
    //S.C.->O(N)
    //Since subarray endpoints matters ,so mark all possible subarrays division.

    public long putMarbles(int[] weights, int k) 
    {
        if (k==1 || k==weights.length)
        {
            return 0;
        }
        int m[]=new int [weights.length-1];
        int u=-1;
        for (int i=0;i<m.length;i++)
        {
            m[++u]=weights[i]+weights[i+1];
        }
        Arrays.sort (m);
        long maxi=0;
        long mini=0;
        for (int i=0;i<k-1;i++)
        {
            mini+=m[i];
            maxi+=m[m.length-i-1];
        }
       
        return (maxi-mini);
    }
}