class Solution {
    public List<Integer> pancakeSort(int[] arr) {
            List<Integer> ls=new ArrayList<Integer>();
            for(int i=arr.length;i>0;i--){
                int index=findTarget(arr,i);
                if(index==-1)continue;
                else{
                    flipArray(arr,index);
                    flipArray(arr,i-1);
                    ls.add(index+1);
                    ls.add(i);
                }
            }
return ls;     
    }
     private static  int findTarget(int[]arr,int target){
            for(int i=0;i<arr.length;i++){
                if(arr[i]==target)return i;
            }
            return -1;
    }
    private static void flipArray(int []arr,int j){
        int i=0;
        while (i<j){
        int temp=arr[i];
        arr[i++]=arr[j];
        arr[j--]=temp;
        }
    }

}
