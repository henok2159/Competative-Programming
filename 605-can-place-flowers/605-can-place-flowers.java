class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int sum=0;
        if(n==0)return true;
        if(flowerbed.length==1){
            return flowerbed[0]!=n;
        }
      for(int i=0;i<flowerbed.length;i++){
          if(flowerbed[i]==0){
          if(i==0){
              if(flowerbed[1]==0){
              sum++;
                flowerbed[0]=1;
              }
          }
         else if(i==flowerbed.length-1){
             if(flowerbed[flowerbed.length-2]==0){
                  flowerbed[flowerbed.length-1]=1;
                    sum++;
             }
            
         }
        else if(flowerbed[i-1]==0&&flowerbed[i+1]==0){
                  flowerbed[i]=1;
                  sum++;
              }
          }
      }
        
        return sum>=n?true:false;
    }
}