/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution 
{
    public List<TreeNode> recur (int a,int b)
    {
        List<TreeNode> l=new ArrayList <>();
        if (a>b)
        {
            l.add (null);
            return l;
        }

        for (int i=a;i<=b;i++)
        {
            List<TreeNode> left=recur (a,i-1);
            List<TreeNode> right=recur (i+1,b);

            for (TreeNode le:left)
            {
                for (TreeNode ri:right)
                {
                    TreeNode root=new TreeNode (i,le,ri);
                    l.add (root);
                }
            }
        }
        return l;
    }
    public List<TreeNode> generateTrees(int n) 
    {
        return recur (1,n);
    }
}