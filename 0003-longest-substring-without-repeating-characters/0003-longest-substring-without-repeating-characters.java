// class Pair 
// {
//     char charr;
//     int ind;
//     Pair (char a,int i)
//     {
//         charr=a;
//         ind=i;
//     }
// }
// class Solution 
// {
//     public int lengthOfLongestSubstring(String s) 
//     {
//         int ans=0;
//         Queue<Pair> q=new LinkedList <>();
//         List<Character> l=new ArrayList <>();
//         for (int i=0;i<s.length();i++)
//         {
//             if (l.contains (s.charAt (i)))
//             {
//                 int stop=l.indexOf(s.charAt(i));
//                 while (!q.isEmpty ()&& q.peek().ind!=stop) 
//                 {
//                     Pair p=q.poll();
//                     l.set (p.ind,'*');
//                 }
//                 if (!q.isEmpty ())
//                 {
//                 Pair p=q.poll();
//                 l.set (p.ind,'*');
//                 }
//             }
//             l.add (s.charAt (i));
//             q.offer (new Pair (s.charAt (i),i));
//             ans=Math.max(ans,q.size());
//         }
//         return ans;
//     }
// }
class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {

        if(s.length()<2) return s.length();

        List<Character> strChar=new LinkedList<Character>();
        int start=0,end=0, longestStr=0;    
        
        while( end<s.length())
        {
            while (!strChar.isEmpty ()&& strChar.contains(s.charAt(end)) && start<=end)
            {
                start++;
                strChar.remove (0);
            }
            strChar.add(s.charAt(end));
            int temp= end-start+1;
            longestStr=Math.max(longestStr, temp);
            end++;

        }
        return longestStr;
       
    }
}