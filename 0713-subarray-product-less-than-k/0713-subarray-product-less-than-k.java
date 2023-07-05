class Solution 
{
    public int numSubarrayProductLessThanK(int[] nums, int k) 
    {
        int ans=0;
        int j=0;
        int prod=1;
        for (int i=0;i<nums.length;i++)
        {
            prod *= nums[i];
            while (prod>=k && j<=i)
            {
                prod=prod/nums[j];
                j++;
            }
            ans+=(i-j+1);
        }
        return ans;
    }
}