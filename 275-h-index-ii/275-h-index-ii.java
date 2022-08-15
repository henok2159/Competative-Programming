class Solution {
    public int hIndex(int[] citations) {
      int low=0;
        int result=0;
      int high=citations.length-1;
        int mid=(high+low)/2;
     //   if(citations.length==1)return 1;
        while(low<=high){
        
            mid=(high+low)/2;
         if(citations[mid]>=citations.length-mid){
             result=citations.length-mid;
             high=mid-1;
         } 
            else{low=mid+1;}
        }
        return result;
    }
    
}