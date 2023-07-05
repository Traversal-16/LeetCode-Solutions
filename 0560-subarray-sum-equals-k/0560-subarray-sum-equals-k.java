class Solution 
{
    public int subarraySum(int[] nums, int k) 
    {
        int ans=0;
        int pre[]=new int [nums.length];
        pre[0]=nums[0];
        for (int i=1;i<nums.length;i++)
        {
            pre[i]=pre[i-1]+nums[i];
        }
        HashMap<Integer,Integer> hmap=new HashMap <>();
        for (int i=0;i<nums.length;i++)
        {
            if (pre[i]==k) ans++;
            if (hmap.containsKey(-(k-pre[i])))
            {
                ans+=hmap.get(-(k-pre[i]));
            }
            hmap.put (pre[i],hmap.getOrDefault (pre[i],0)+1);
        }
        return ans;
    }
}