//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking testcases
		int T=sc.nextInt();
		
		while(T-->0)
		{
		    Solution  obj=new Solution ();
		    int a,m;
		    
		      
            //taking input a and m
		    a=sc.nextInt();
		    m=sc.nextInt();
		    
		    
		  
            //calling function modInverse()
		    System.out.println(obj.modInverse(a,m));
		   
		    
		}
		
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution
{
    public int bin (int num,int pow)
    {
        int mod=pow+2;
        int res=1;
        while (pow>0)
        {
            if (pow%2!=0)
            {
                res =(res*num)%mod;
            }
            num=(num*num)%mod;
            pow >>=1;
        }
        return res;
    }
  public int modInverse(int a, int m)
    {
      //Your code here
      int b=1;
      while (b<m)
      {
          if ((b*a)%m==1)
          {
              return b;
          }
          b++;
      }
      return -1;
    }

}
