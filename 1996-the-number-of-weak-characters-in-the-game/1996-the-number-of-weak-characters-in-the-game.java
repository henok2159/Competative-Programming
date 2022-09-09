class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
       Arrays.sort(properties, new Comparator<int[]>() {
     @Override
     public int compare(int[] o1, int[] o2) {
         int result = Integer.compare(o2[0], o1[0]);
         if (result == 0) {
             result = Integer.compare(o1[1], o2[1]);
         }
         return result;
     }
 });    int maxval=properties[0][1];
        System.out.println(properties[0][0]+" "+properties[0][1]);
           int count=0;
        for(int i=1;i<properties.length;i++){
            System.out.println(properties[i][0]+" "+properties[i][1]);
           if(maxval>properties[i][1]){
               count++;
           } 
            else maxval=Math.max(maxval,properties[i][1]);
        }
        return count;
    }
}