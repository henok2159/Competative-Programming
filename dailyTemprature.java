class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer>temp=new Stack();
        Stack<Integer>index=new Stack();
        HashMap<Integer,Integer>hm=new HashMap();
        int [] h=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            while(!temp.empty()&&temp.peek()<temperatures[i]){
                h[index.peek()]=i-index.pop();
                temp.pop();
            }
            temp.push(temperatures[i]);
            index.push(i);
        }
        return h;
    }
}
