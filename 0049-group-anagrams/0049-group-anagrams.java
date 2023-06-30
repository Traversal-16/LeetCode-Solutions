class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        int n=strs.length;
        String hum[]=new String[n];
        for (int i=0;i<n;i++)
        {
            hum[i]=strs[i];
        }
        for (int i=0;i<n;i++)
        {
            char []shiv=hum[i].toCharArray ();
            Arrays.sort (shiv);
            String ram=new String ();
            hum[i]=ram.valueOf (shiv);
        }
        List<List<String>> l=new ArrayList <>();
        HashMap<String,List<String>> h=new HashMap<>();
        for (int i=0;i<n;i++)
        {
            if (!h.containsKey (hum[i]))
            {
                h.put (hum[i],new ArrayList <>());
                h.get(hum[i]).add (strs[i]);
            }
            else
            {
                h.get(hum[i]).add(strs[i]);
            }
        }
        Iterator<String> it=h.keySet ().iterator();
        while (it.hasNext ())
        {
           List<String> shriram=h.get(it.next());
           l.add(new ArrayList <>(shriram));
        }
        
        return l;
        
    }
}