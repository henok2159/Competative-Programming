class Solution {
  List<String> divideString(String s, int k, String fill) {
        List<String>arr=[];
        for (int i=0;i<s.length;i+=k){
            if (i+k<=s.length){
                arr.add(s.substring(i,i+k));
            }
            else{
                String word='';
                for(int j=0;j<k;j++){
                    if(j+i<s.length){
                        word=word+s[j+i];
                    }else{
                        word=word+fill;
                    }

                }
                arr.add(word);
            }
        }
        return arr;
  }
}