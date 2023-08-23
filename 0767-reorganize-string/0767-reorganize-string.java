class Solution 
{
    public String reorganizeString(String s) 
    {
        int st[]=new int [26];

        for (int i=0;i<s.length();i++)
        {
            st[s.charAt (i)-'a']++;
        }

        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->(st[b-'a']-st[a-'a']));
        for (char a='a';a<='z';a++)
        {
            if (st[a-'a']>0)
            {
                pq.offer (a);
            }
        }
        String ans="";
        while (pq.size()>=2)
        {
            char a=pq.poll ();
            char b=pq.poll ();
                ans+=a;
                ans+=b;
                st[a-'a']--;
                st[b-'a']--;
            if (st[a-'a']>0)
            {
                pq.offer (a);
            }
            if (st[b-'a']>0)
            {
                pq.offer (b);
            }
            System.out.println (ans);

        }
        if (pq.isEmpty ())
        {
            return ans;
        }
        else
        {
            char as=pq.poll ();
            if (st[as-'a']>1)
            {
                return "";
            }
            else
            {
                ans+=as;
                return ans;
            }
        }
    }
}