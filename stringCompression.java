class Solution {
    public int compress(char[] chars) {
        int i=0;
        int j=0;
        int count=0;
        int len=0;
       while(j<chars.length){
           if(j+1<chars.length&&chars[j]==chars[j+1]){
               j++;
           }else{
               j++;
                   if(j-i>1){
                      len++;
                       chars[count++]=chars[i];
                        if(Integer.toString(j-i).length()>1){
                   int k=0;
                   String a=Integer.toString(j-i);
                   while(k<a.length()){
                      chars[count++]=a.charAt(k);
                       len++;
                       k++;
                   }
               }else {len++;
                        chars[count++]=Integer.toString(j-i).charAt(0);
                     
                     
                     }
               
                       
                   }else {len++;
                         chars[count++]=chars[i];
                         }
               
              
               i=j;
           }
       }
        
        
        return len;
    }
}
