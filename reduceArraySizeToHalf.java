class Solution {
    public int minSetSize(int[] arr) {
      Arrays.sort(arr);
       int n=arr[0];
       int count=0;
       List<Integer>ls=new ArrayList<Integer>();
       for(int i=0;i<arr.length;i++){
            if(n==arr[i]){
                count++;
            }
            else{
                ls.add(count);
                n=arr[i];
                count=1;

            }
       }

           ls.add(count);

       Collections.sort(ls,Collections.reverseOrder());
       int size=arr.length;
       int c=0;
       while(size>arr.length/2){
           size=size-ls.get(c);
           c++;
       }
       return c;
    }
}
