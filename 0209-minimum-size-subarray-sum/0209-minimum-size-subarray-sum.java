class Solution {
    public int minSubArrayLen(int target, int[] nums) 
    {
        int sum=0;
        int ans=(int)1e9;
        int i=0,j=0;
        int n=nums.length;
        while (i<n)
        {
            sum+=nums[i];
            while (sum>=target)
            {
                ans=Math.min (ans,i-j+1);
                sum-=nums[j];
                j++;
            }
            i++;
        }
        return (ans==(int)1e9)? 0:ans;
            
    }
}