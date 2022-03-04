class Solution {
    public boolean isPowerOfFour(int n) {
        boolean check=false;
        while(n>=1){
          if(n==1){
              check= true;
             break;
          }
            if(n>=4&&n%4==0)n=n/4;
            else break;
        }
        
        return check;
    }
}
