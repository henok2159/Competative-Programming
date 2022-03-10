class Solution {
     public double myPow(double x, int n) {
        int val = Math.abs(n);
        if(n<0)
          x = 1/x;  
        double res = calculateValue(x,val);
        return res;

    }

    public double calculateValue(double x,int val)
    {
        if(val == 0)
            return 1.0;
        if(val == 1)
            return x;
        double temp = calculateValue(x,val/2);
        if(val%2 == 0)
            return temp*temp;
        else
            return x*temp*temp;
    }
}
