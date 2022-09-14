class Solution {
    List<List<Integer>>ls;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ls=new ArrayList();
        dfs(0,new Stack(),0,target,candidates);
        return ls;
        
    }
    void dfs(int i,Stack<Integer>curr,int total,int target,int[] candidates){
        
        if(total==target){
           
            ArrayList<Integer>ll=new ArrayList();
            for(int item:curr)ll.add(item);
             ls.add(ll);
            return;
        }
        if(total>target||i>candidates.length-1){
            return;
        }
       
        curr.push(candidates[i]);
        
        dfs(i,curr,total+candidates[i],target,candidates);
        curr.pop();
        dfs(i+1,curr,total,target,candidates);
            
        
    }
}