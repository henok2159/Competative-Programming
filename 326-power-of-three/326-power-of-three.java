class Solution {
    public boolean isPowerOfThree(int n) {
    boolean check=false;
        while(n>=1){
          if(n==1){
              check= true;
             break;
          }
            if(n>=3&&n%3==0)n=n/3;
            else break;
        }
        
        return check;
    }
    
}