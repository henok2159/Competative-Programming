class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length()==1)return "";
        boolean isA=false;
        String sss="";
        for(int i=0;i<palindrome.length();i++){
            if(!isA&&palindrome.charAt(i)!='a'&&palindrome.length()/2!=i){
                isA=true;
                sss+='a';
            }
            else {
                sss+=palindrome.charAt(i);
            }
        }
        if(!isA){
            sss=sss.substring(0,sss.length()-1);
            sss+='b';
        }
        return sss;
    }
}