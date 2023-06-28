class Solution 
{
    public void nextPermutation(int[] nums) 
    {
        if (nums.length<=1) return;

        //Code to find pivot from last
        int last=nums.length-2;
        while (last>=0)
        {
            if (nums[last]<nums[last+1])
            {
                break;
            }
            last--;
        }

        //Code to find next permutation in circular way if next doesn't exist
        if (last<0) 
        {
            int left=0;
            int right=nums.length-1;
            while (left<=right)
            {
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right--;
            }
            return;
        }


        int j=nums.length-1;
        while (j>last)
        {
            if (nums[j]>nums[last])
            {
                break;
            }
            else
            {
                j--;
            }
        }

        //Now swap element at j and pivot matalab last me store kiye ho bhaiii

        int temp=nums[last];
        nums[last]=nums[j];
        nums[j]=temp;



        //now reverse suffix to get directly next permutation
        int p1=last+1;
        int p2=nums.length-1;
        while (p1<=p2)
        {
            int temp2=nums[p1];
            nums[p1]=nums[p2];
            nums[p2]=temp2;
            p1++;
            p2--;
        }
    }
}