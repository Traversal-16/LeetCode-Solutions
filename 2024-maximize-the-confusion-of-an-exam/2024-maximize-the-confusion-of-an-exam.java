class Solution 
{
    public int check (String s,int k,char a)
    {
        int i=0;
        int j=0;
        int ans=0;
        while (i<s.length ())
        {
            if (s.charAt (i)!=a)
            {
                k--;
            }
            while (k<0 )
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
            ans=Math.max(ans,i-j+1);
            i++;
        }
        return ans;
    }
    public int maxConsecutiveAnswers(String answerKey, int k) 
    {
        int k1=check (answerKey,k,'T');
        int k2=check (answerKey,k,'F');
        return Math.max (k1,k2);
    }
}