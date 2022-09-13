class Solution {
    boolean bool [];
    List<List<Integer>>ls;
    public List<List<Integer>> permute(int[] nums) {
        bool=new boolean[nums.length];
        ls=new ArrayList();
        ArrayList<Integer>back=new ArrayList();
        backtrack(back,nums);
       return ls;
    }
    
    void backtrack(ArrayList<Integer>back,int[] nums){
        if(back.size()==nums.length){
            ls.add(back);
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!bool[i]){
                bool[i]=true;
                ArrayList<Integer>al=new ArrayList();
                al=(ArrayList)back.clone();
                al.add(nums[i]);
                backtrack(al,nums);
                bool[i]=false;
                back.remove(new Integer(nums[i]));
            }
        }
        
    }
}