class Solution 
{
    public String frequencySort(String s) 
    {
        HashMap<Character,Integer> hmap=new HashMap<>();
        for (int i=0;i<s.length();i++)
        {
            char a=s.charAt (i);
            hmap.put (a,hmap.getOrDefault (a,0)+1);
        }

        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->(hmap.get(b)-hmap.get (a)));
        HashMap<Character,Integer> vis=new HashMap <>();
        for (int i=0;i<s.length ();i++)
        {
            if (vis.containsKey(s.charAt (i))) continue;
            else
            {
                pq.offer (s.charAt (i));
                vis.put (s.charAt (i),1);
            }
        }
        String str="";
        while (!pq.isEmpty ())
        {
            char a=pq.poll ();
            for (int i=1;i<=hmap.get (a);i++)
            {
                str+=a;
            }
        }
        return str;
       
    }
}