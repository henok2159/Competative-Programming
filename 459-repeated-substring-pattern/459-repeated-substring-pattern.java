class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int[] map = new int[s.length()];
        
        int i = 0;
        int j = 1;
        while (j < s.length()){
            if (s.charAt(i) == s.charAt(j)){
                map[j++] = ++i;
            }
            
            else if (i > 0) {
                i = map[i-1];
            }
            
            else {
                ++j;
            }
        }
        
        return map[map.length - 1] != 0 && (s.length() % (s.length() - map[map.length -1 ]) == 0);
    }
}