class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
     List<List<Integer>>ls=new ArrayList();
        for(int i=0;i<triangle.size();i++){
            List<Integer>list=new ArrayList();
            for(int j=0;j<triangle.get(i).size();j++){
                if(i==0&&j==0){
                 list.add(triangle.get(i).get(j));
                   
                }
                else if(j==0){
                    list.add(ls.get(i-1).get(j)+triangle.get(i).get(j));
                }else if(j==triangle.get(i).size()-1){
                    list.add(ls.get(i-1).get(j-1)+triangle.get(i).get(j));
                }
                else{
                    int a=Math.min(ls.get(i-1).get(j-1),ls.get(i-1).get(j));
                    list.add(triangle.get(i).get(j)+a);
                }
            }
             ls.add(list);
        }
        int d=ls.size();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<ls.get(d-1).size();i++){
            min=Math.min(min,ls.get(d-1).get(i));
        }
        return min;
    }
}