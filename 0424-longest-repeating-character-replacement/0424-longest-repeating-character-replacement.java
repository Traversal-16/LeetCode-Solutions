class Solution 
{
    public int check (String s,int k,char a)
    {
        int i=0;
        int j=0;
        int ans=0;
        while (i<s.length())
        {
            if (s.charAt (i)!=a)
            {
                k--;
            }
            while (k<0)
            {
                if (s.charAt (j)==a)
                {
                    j++;
                }
                else
                {
                    k++;
                    j++;
                }
            }
            ans=Math.max (ans,i-j+1);
            i++;
        }
        return ans;
    }
    public int characterReplacement(String s, int k) 
    {
        int ans=0;
        for (char a='A';a<='Z';a++)
        {
            int k1=check (s,k,a);
            ans=Math.max (ans,k1);
        }   
        return ans;
    }
}