class Solution {
    boolean bool[];
    List<List<Integer>>ls;
    public List<List<Integer>> permuteUnique(int[] nums) {
        bool=new boolean[nums.length];
        ls=new ArrayList();
        ArrayList back=new ArrayList();
        backtrack(back,nums);
        return ls;
    }
    void backtrack(ArrayList<Integer>back,int[]nums){
        if(back.size()==nums.length){
            if(isUnique(back))
                ls.add(back);
            
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!bool[i]){
                bool[i]=true;
                ArrayList al=new ArrayList();
                al=(ArrayList)back.clone();
                al.add(nums[i]);
                backtrack(al,nums);
                bool[i]=false;
                int index=back.size()-1;
                if(index==nums.length-1)
                back.remove(index);
            }
        }
    }
    boolean isUnique(List back){
        int i=0;
        while(i<ls.size()){
            if(back.equals(ls.get(i))){
                return false;
            }
            i++;
        }
        return true;
    }
}