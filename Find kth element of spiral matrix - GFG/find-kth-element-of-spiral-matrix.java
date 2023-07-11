//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[1000][1000];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    /*You are required to complete this method*/
    int findK(int A[][], int n, int m, int k)
    {
	// Your code here	
	ArrayList<Integer> l=new ArrayList <>();
	int top=0;
	int left=0;
	int bottom=n-1;
	int right=m-1;
	while (left<=bottom && top<=bottom)
	{
	    for (int i=left;i<=right;i++)
	    {
	        l.add(A[top][i]);
	    }
	    top++;
	    for (int i=top;i<=bottom;i++)
	    {
	        l.add (A[i][right]);
	    }
	    right--;
	    if (top<=bottom)
	    {
	        for (int i=right;i>=left;i--)
	        {
	        l.add (A[bottom][i]);
	        }
	        bottom--;
	    }
	    
	    if (left<=right)
	    {
	        for (int i=bottom;i>=top;i--)
	        {
	        l.add(A[i][left]);
	        }
	        left++;
	    }
	}
	return l.get (k-1);
}
}