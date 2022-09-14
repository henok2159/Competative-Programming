class Solution {
    List<List<Integer>>ls;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ls=new ArrayList();
        dfs(0,new ArrayList(),0,target,candidates);
        return ls;
        
    }
    void dfs(int i,ArrayList<Integer>curr,int total,int target,int[] candidates){
        
        if(total==target){
            ls.add(curr);
            return;
        }
        if(total>target||i>candidates.length-1){
            return;
        }
        ArrayList al=new ArrayList();
        ArrayList aa=new ArrayList();
        al=(ArrayList)curr.clone();
        aa=(ArrayList)curr.clone();
        al.add(candidates[i]);
        
        
        dfs(i,al,total+candidates[i],target,candidates);
        dfs(i+1,aa,total,target,candidates);
            
        
    }
}