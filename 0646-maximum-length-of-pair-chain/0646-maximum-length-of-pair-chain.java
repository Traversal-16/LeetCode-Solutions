class Solution 
{
    public int findLongestChain(int[][] pairs) 
    {
        Arrays.sort (pairs,new Comparator<int[]>()
        {
            public int compare (int a[],int b[])
            {
                if (a[1]==b[1])
                {
                    return a[0]-b[0];
                }
                else
                {
                    return a[1]-b[1];
                }
            }
        });
        
        int c=1;
        //int ans=1;
        int last=pairs[0][1];
        for (int i=1;i<pairs.length;i++)
        {
            if (pairs[i][0]>last)
            {
                c++;
                last=pairs[i][1];
            }
        }
        return c;
    }
}