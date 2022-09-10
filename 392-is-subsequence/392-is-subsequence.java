class Solution {
    public boolean isSubsequence(String s, String t) {
        int count=0;
        int i=0;int j=0;
        while(i<s.length()&&j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                count++;
                i++;j++;
            }else j++;
        
        }
        return count==s.length();
    }
    
}