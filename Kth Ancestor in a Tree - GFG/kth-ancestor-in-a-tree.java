//{ Driver Code Starts
//Initial Template for Java

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class GfG {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t > 0){
	            String arr[] = br.readLine().split(" ");
	            int k = Integer.parseInt(arr[0]);
	            int node = Integer.parseInt(arr[1]);
	            String s = br.readLine();
    	    	Node root = buildTree(s);
    	    	
                Solution g = new Solution();
        		System.out.println(g.kthAncestor(root,k,node));
                    t--;
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

/*
Structure of Node class is:

class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
*/

class Solution
{
    public void store (Node root,HashMap<Integer,Integer> hmap)
    {
        if (root==null)
        {
            return ;
        }
        
        if (root.left!=null)
        {
            hmap.put (root.left.data,root.data);
            store (root.left,hmap);
        }
        
        if (root.right!=null)
        {
            hmap.put (root.right.data,root.data);
            store (root.right,hmap);
        }
    }
    public void precompute (int parents[],int dp[][])
    {
        for (int i=0;i<24;i++)
        {
            for (int j=0;j<parents.length;j++)
            {
                if (i==0)
                {
                    dp[0][j]=parents[j];
                }
                else 
                {
                    if (dp[i-1][j]!=-1)
                    {
                        dp[i][j]=dp[i-1][dp[i-1][j]];
                    }
                    else
                    {
                        dp[i][j]=-1;
                    }
                }
            }
        }
    }
    public int kthAncestor(Node root, int k, int node)
    {
        //Write your code here
        HashMap<Integer,Integer> hmap=new HashMap <>();
        store (root,hmap);
        int parents[]=new int [hmap.size ()+1];
        parents[0]=-1;
        Iterator<Integer> it=hmap.keySet ().iterator ();
        while (it.hasNext ())
        {
            int l=it.next ();
            //System.out.println (l+" "+hmap.get (l));
            parents[l-1]=hmap.get (l)-1;
        }
        int dp[][]=new int [24][parents.length];
        for (int t[]:dp)
        {
            Arrays.fill (t,-1);
        }
        precompute (parents,dp);
        
        node=node-1;
        
        int bit=0;
        while(k!=0)
        {
            if(node==-1)
            {
                return -1;
            }
            if((k&1)!=0)
            {
                node = dp[bit][node];
            }
            k = k>>1;
            bit++;
        }
        if (node==-1)
        {
            return -1;
        }
        return node+1;
    }
}