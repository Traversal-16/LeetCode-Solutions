class Solution 
{
    //Sort the array
    //select low and high for force limits
    public boolean check (int position[],int n,int m,int force)
    {
        int pos=position[0];
        int c=1;
        for (int i=0;i<n;i++)
        {
            if ((position[i]-pos)>=force)
            {
                c++;
                pos=position[i];
            }
        }

        if (c>=m) return true;
        return false;
    }
    public int maxDistance(int[] position, int m) 
    {
        Arrays.sort (position);
        int low=0;
        int high=position[position.length-1]-position[0];
        int ans=-1;
        if (m==2) return high;
        while (low<=high)
        {
            int mid=(int)(low+high)/2;
            if (check(position,position.length,m,mid)==true)
            {
                ans=mid;
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return ans;
    }
}