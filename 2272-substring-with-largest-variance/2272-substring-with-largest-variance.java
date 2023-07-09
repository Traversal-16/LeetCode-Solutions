class Solution 
{
    public int largestVariance(String s) 
    {
        int freq[]=new int[26];
        for (int i=0;i<s.length();i++)
        {
            freq[s.charAt (i)-'a']++;
        }

        int max=0;
        for (int i=0;i<26;i++)
        {
            for (int j=0;j<26;j++)
            {
                if (i==j || freq[i]==0 || freq[j]==0) continue;
                int A=0;
                int B=0;
                int restB=freq[j];
                for (int i1=0;i1<s.length();i1++)
                {
                    int k=s.charAt (i1)-'a';
                    if (k!=i && k!=j) continue;
                    else if (k==i) A++;
                    else 
                    {
                        B++;
                        restB--;
                    }

                    if (B>0)
                    {
                        max=Math.max (max,A-B);
                    }
                    if (A<B && restB>0)
                    {
                        A=0;
                        B=0;
                    }
                }
            }
        }
        return max;
        
    }
}