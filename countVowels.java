class Solution {
    public long countVowels(String word) {
        int n=word.length();
        long x=0;
        long res=0;
        for(int i=0;i<n;i++){
            if(isVowel(word.charAt(i))){
              x=x+i+1;  
            }
            res=res+x;
        }
        return res;
    }
    public boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        return true;
        return false;
    }
}
