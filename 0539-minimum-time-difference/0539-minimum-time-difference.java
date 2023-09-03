class Solution 
{
    public int findMinDifference(List<String> timePoints) 
    {
        List<Integer> l=new ArrayList <>();
        for (int i=0;i<timePoints.size();i++)
        {
            String s=timePoints.get (i);
            int hrs=Integer.parseInt(s.substring (0,2));
            int min=Integer.parseInt(s.substring (3,5));
            int total=(hrs*60+min);
            l.add (total);
        }
        Collections.sort (l);

        int first=l.get (0);
        int diff=Integer.MAX_VALUE;
        for (int i=1;i<l.size();i++)
        {
            int sec=l.get (i);
            diff=Math.min (diff,sec-first);
            first=sec;
        }
        diff=Math.min (diff,1440-l.get(l.size()-1)+l.get(0));
        return diff;
    }
}