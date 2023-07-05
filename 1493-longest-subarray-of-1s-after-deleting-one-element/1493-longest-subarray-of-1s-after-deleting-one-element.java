class Solution 
{
    public int longestSubarray(int[] nums) 
    {
        int sizeright[]=new int [nums.length];
        int sizeleft[]=new int [nums.length];
        int count=0;
        int zero=-1;
        for (int i=0;i<nums.length;i++)
        {
            if (nums[i]==0)
            {
                zero=i;
                break;
            }
        }
        if (zero==-1) return nums.length-1;



        for (int i=0;i<nums.length;i++)
        {
            if (nums[i]==1)
            {
                count++;
            }
            else
            {
                sizeright[i]=count;
                count=0;
            }
        }
          count=0;
        for (int i=nums.length-1;i>=0;i--)
        {
            if (nums[i]==1)
            {
                count++;
            }
            else
            {
                sizeleft[i]=count;
                count=0;
            }
        }
      
        int ans=0;
        for (int i=0;i<nums.length;i++)
        {
            ans=Math.max (ans,sizeleft[i]+sizeright[i]);
        }
        return ans;
    }
}