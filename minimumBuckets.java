class Solution {
    public int minimumBuckets(String street) {
        int n=street.length()-1;
        StringBuilder streetb = new StringBuilder(street);
        int count=0;
        int i=0;
        if(n==0&&street.charAt(n)=='H'){
            return -1;
        }
       while(i<=n){
           
            if(streetb.charAt(i)=='H'){
                if(i==0){
                    if(streetb.charAt(1)=='.'){
                        streetb.setCharAt(1,'B');
                        i++;
                        count++;
                    }else return -1;
                }
                else if(i==n){
                    if(streetb.charAt(i-1)=='H')return -1;
                    else if(streetb.charAt(i-1)=='B')i++;
                    else{
                        count++;
                        i++;
                    }
                }
            
            
              else if(streetb.charAt(i-1)=='B')i++;
           else if(streetb.charAt(i-1)=='H'&&streetb.charAt(i+1)=='H')return -1;
           else if(streetb.charAt(i+1)=='.'){
               streetb.setCharAt(i+1,'B');
               count++;
               i++;
           }
                
           else if(street.charAt(i-1)=='.'){
               count++;
               i++;
           }
           
       }else i++;
       
       }
        return count;
    }
}
