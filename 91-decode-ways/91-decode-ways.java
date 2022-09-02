class Solution {
    int []a;
    public int numDecodings(String s) {
        if(s.charAt(0)=='0')return 0;
       
        a=new int[s.length()];
        for(int i=0;i<s.length();i++){
            a[i]=-1;
        }
         int n=decodeString(s,0);
        return n;
    }
   public int decodeString(String s,int i){
       if(i==s.length()){
           return 1;
       }
       if(a[i]!=-1){
           return a[i];
       }else{
           
       }
            int first= Integer.parseInt(Character.toString(s.charAt(i)));
       if(first==0){
           return 0;
       }
       int res=0;
       
        res=decodeString(s,i+1);
       if(i<s.length()-1){
        int last=Integer.parseInt(Character.toString(s.charAt(i+1)));
       int ans=first*10+last;
       if(ans<27){
         res+=  decodeString(s,i+2);
       }
           a[i]=res;
       }
             return res;
       
     
    
   }
}