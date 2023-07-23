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
class Solution {
    public List<TreeNode> allPossibleFBT(int n) {
        
        return solve(n);
        
    }
    public List<TreeNode> solve(int n){

    ArrayList<TreeNode> list=new ArrayList<>();
        if(n==1){
            TreeNode node=new TreeNode(0);
            list.add(node);
            return list;
        }
        if(n%2==0){
            return list;
        }

      
        for(int i=1; i<n; i=i+2){
            List<TreeNode> left=allPossibleFBT(i);
            List<TreeNode> right=allPossibleFBT(n-i-1);

            for(TreeNode l : left){
                for(TreeNode r : right){
                    TreeNode node=new TreeNode(0);
                    node.left=l;
                    node.right=r;
                    list.add(node);
                }
            }
        }

        return list;
    }
}