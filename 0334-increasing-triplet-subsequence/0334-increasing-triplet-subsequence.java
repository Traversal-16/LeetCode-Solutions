class Solution 
{
    public boolean increasingTriplet(int[] nums) 
    {
        int n=nums.length;
        int smallest[]=new int [n];
        int largest[]=new int[n];
        smallest[0]=nums[0];
        largest[nums.length-1]=nums[nums.length-1];
        for (int i=1;i<nums.length;i++)
        {
            smallest[i]=Math.min (smallest[i-1],nums[i]);
        }
        for (int i=nums.length-2;i>=0;i--)
        {
            largest[i]=Math.max (largest[i+1],nums[i]);
        }


        for (int i=0;i<n;i++)
        {
            if (smallest[i]!=nums[i] && largest[i]!=nums[i])
            {
                return true;
            }
        }
        return false;
    }
}