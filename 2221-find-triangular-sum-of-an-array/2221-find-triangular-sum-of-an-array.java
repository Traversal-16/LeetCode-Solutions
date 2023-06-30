class Solution 
{
    public int [] f (int n,int nums[])
    {
        if (n==1) return nums;

        int dp[]=new int [nums.length-1];
        
        for (int i=1;i<n;i++)
        {
            dp[i-1]=(nums[i]+nums[i-1])%10;
        }
        // for (int i:dp) System.out.print (i+" ");
        // System.out.println ();
        return f(n-1,dp);
    }
    public int triangularSum(int[] nums) 
    {
        int ans[]=f(nums.length,nums);
        return ans[0];   
    }
}