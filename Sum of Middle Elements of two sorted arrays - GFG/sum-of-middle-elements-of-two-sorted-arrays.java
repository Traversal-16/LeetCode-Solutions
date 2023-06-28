//{ Driver Code Starts
// Initial Template for Java

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

  public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] ar1 = new int[n], ar2 = new int[n];
            String[] inputLine = br.readLine().split(" ");

            for (int i = 0; i < n; i++) {
                ar1[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                ar2[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().findMidSum(ar1, ar2, n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int findMidSum(int[] arr1, int[] arr2, int n) {
        // code here
        List<Integer> l=new ArrayList <>();
        int i=0;
        int j=0;
        while (i<arr1.length && j<arr2.length)
        {
            if (arr1[i]<arr2[j])
            {
                l.add(arr1[i]);
                i++;
            }
            else
            {
                l.add(arr2[j]);
                j++;
            }
        }
        while (i<arr1.length)
        {
            l.add(arr1[i]);
            i++;
        }
        while (j<arr2.length)
        {
            l.add(arr2[j]);
            j++;
        }
        
        int k=l.get (n-1)+l.get(n);
        return k;
    }
}