class Solution {
    public int divide(int dividend, int divisor) {
        int  count=0;
       
        int dd =Math.abs(dividend);
        int dv =Math.abs(divisor);
      
        if(dividend==0)return 0;
        if(divisor==1)return dividend;
        if(divisor==-1){
            if(dividend==Integer.MIN_VALUE)return Integer.MAX_VALUE;
            else return -dividend;
        }
           return dividend/divisor;
    }
}