// class Solution 
// {
//     public int recursion (int arr[],int d,int prev,int i,int dp[][])
//     {
//         if (i==arr.length)
//         {
//             return 0;
//         }
//         if (prev!=-1 && dp[prev][i]!=-1) return dp[prev][i];
//         int c1=0;
//         if (prev==-1 || (arr[i]-arr[prev])==d)
//         {
//             c1=1+recursion (arr,d,i,i+1,dp);
//         }
//         int c2=recursion (arr,d,prev,i+1,dp);

//         if (prev!=-1)
//         {
//         return dp[prev][i]=Math.max (c1,c2);
//         }
//         else
//         {
//         return Math.max (c1,c2);
//         }

//     }
//     public int longestSubsequence(int[] arr, int difference) 
//     {
//         int dp[][]=new int [arr.length+1][arr.length+1];
//         for (int t[]:dp) Arrays.fill (t,-1);
//         return recursion (arr,difference,-1,0,dp);
//     }
// }

class Solution 
{
    public int longestSubsequence(int[] arr, int difference) 
    {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        int ans=0;
        for (int i=0;i<arr.length;i++)
        {
            hmap.put (arr[i],hmap.getOrDefault(arr[i]-difference,0)+1);
            ans=Math.max (ans,hmap.get(arr[i]));
        }
        return ans;
    }
}