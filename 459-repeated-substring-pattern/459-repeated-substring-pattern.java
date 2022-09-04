class Solution {
    public boolean repeatedSubstringPattern(String s) {
        char start = s.charAt(0);
        for ( int i = 1; i < s.length(); i++ ) 
            if (s.charAt(i) == start && s.length()%i == 0 && (s.replaceAll(s.substring(0, i), "").length() == 0) ) return true;
        return false;
    }
}