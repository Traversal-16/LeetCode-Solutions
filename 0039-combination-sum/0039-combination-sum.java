class Solution 
{
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        List<Integer> l=new ArrayList <>();
        List<List<Integer>> ans=new ArrayList <>();
        check (candidates,target,0,l,ans);
        return ans;
    }
    public void check (int candidates[],int target,int ind,List<Integer> l,List<List<Integer>> ans)
    {
        if (ind==candidates.length )
        {
        if (target==0)
        {
            ans.add(new ArrayList<>(l));
        }
        return;
        }
        if (ind<candidates.length && candidates[ind]<=target){
            l.add (candidates[ind]);
            check (candidates,target-candidates[ind],ind,l,ans);
            l.remove (l.size()-1);
        }
        check (candidates,target,ind+1,l,ans);
    }
}