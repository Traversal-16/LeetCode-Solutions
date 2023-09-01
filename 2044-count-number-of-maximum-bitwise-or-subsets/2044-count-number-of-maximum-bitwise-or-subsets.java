class Solution 
{
    public int max (int nums[],int i)
    {
        if (i<0)
        {
            return 0;
        }

        int choice1=max(nums,i-1);
        int choice2=nums[i] | max(nums,i-1);

        return Math.max (choice1,choice2);
    }

    public int count (int nums[],int i,int maxi,int curr)
    {
        if (i<0)
        {
            if (curr==maxi)
            {
                return 1;
            }
            return 0;
        }

        int choice1=count (nums,i-1,maxi,curr | nums[i]);
        int choice2=count (nums,i-1,maxi,curr);

        return choice1 + choice2;
    }
    public int countMaxOrSubsets(int[] nums) 
    {
        int maxi=max(nums,nums.length-1);
        
        return count (nums,nums.length-1,maxi,0);
    }
}