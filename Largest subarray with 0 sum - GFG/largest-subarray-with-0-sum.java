//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        // subarray ka sum zero do tarah se ho sakta hai
        //(i). prefix sum zero ho
        //(ii). do jagah prefix sum same ho.
        
        HashMap<Integer,Integer> h=new HashMap<>();
        int sum=0;
        int maxi=0;
        for (int i=0;i<n;i++)
        {
            sum+=arr[i];
            if (sum==0)
            {
                maxi=i+1;
            }
            else if (h.containsKey (sum)==true)
            {
                maxi=Math.max (maxi,i-h.get(sum));
            }
            else
            {
                h.put(sum,i);
            }
        }
        return maxi;
    }
}