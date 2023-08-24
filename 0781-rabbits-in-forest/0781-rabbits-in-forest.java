class Solution 
{
    public int numRabbits(int[] answers) 
    {
        HashMap<Integer,Integer> hmap=new HashMap <>();
        for (int i=0;i<answers.length;i++)
        {
            hmap.put (answers[i],hmap.getOrDefault (answers[i],0)+1);
        }

        int rabbit=0;
        for (int key : hmap.keySet ())
        {
            double val=(double)hmap.get (key);
            key=key+1;
            rabbit+=(int)(Math.ceil((val)/key))*key;
        }
        return rabbit;
        
    }
}