class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length()==1)return "";
        boolean isA=false;
        String sss="";
        for(int i=0;i<palindrome.length();i++){
            if(!isA&&palindrome.charAt(i)!='a'&&palindrome.length()/2!=i){
                isA=true;
           palindrome=     palindrome.substring(0,i)+"a"+palindrome.substring(i+1,palindrome.length());
                break;
            }
          
        }
        if(!isA){
            palindrome=palindrome.substring(0,palindrome.length()-1)+"b";
            
        }
        return palindrome;
    }
}