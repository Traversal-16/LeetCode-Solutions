class Solution 
{
    public boolean buddyStrings(String s, String goal) 
    {
        if (s.length()!=goal.length()) return false;
        if (s.equals(goal))
        {
            int a[]=new int[26];
            for (int i=0;i<s.length();i++)
            {
                a[s.charAt(i)-'a']++;
            }
            for (int i=0;i<26;i++)
            {
                if (a[i]>1)
                {
                    return true;
                }
            }
            return false;
        }
        int count=0;
        int pos=0;
        int pos2=0;
        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)!=goal.charAt(i))
            {
                count++;
                if (count==1)
                {
                    pos=i;
                }
                if (count==2)
                {
                    pos2=i;
                }
            }
        }
        if (count!=2) 
        {
            return false;
        }
        if (count==2)
        {
            if (s.charAt(pos2)==goal.charAt(pos) && s.charAt(pos)==goal.charAt(pos2))
            {
                return true;
            }
            return false;
        }
        return true;

        
    }
}