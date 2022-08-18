class Solution {
    public boolean canReach(int[] arr, int start) {
       boolean []seen =new boolean[arr.length];
        Queue<Integer>queue=new LinkedList();
       
        queue.add(start);
        while(!queue.isEmpty()){
            int i=queue.remove();
            if(arr[i]==0)return true;
            seen[i]=true;
            int inc=(i+arr[i]);
            if(inc<arr.length&&!seen[inc]) queue.add(inc);
            int dec=(i-arr[i]);
            if(dec>=0&&!seen[dec])
            queue.add(dec);
            
        }
        return false;
    }
}