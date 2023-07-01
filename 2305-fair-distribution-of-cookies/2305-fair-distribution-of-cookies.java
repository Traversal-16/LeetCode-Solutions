class Solution 
{
     public void recursion(int idx, int[] cookies, int k, int[] val)
     {
        if(idx==cookies.length)
        {
            int max = 0;
            for(int i = 0;i<k;i++)
            {
                max = Math.max(max,val[i]);
            }
            res = Math.min(max,res);
            return;
        }
        
        for(int i = 0;i<k;i++)
        {
            val[i] += cookies[idx];
            recursion(idx+1,cookies,k,val);
            val[i] -= cookies[idx];
        }
        
       
    }
    int res = Integer.MAX_VALUE;
    public int distributeCookies(int[] cookies, int k) 
    {
        int[] val = new int[k];
        recursion(0,cookies,k,val);
        return res;
    }
}