class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;int j=0;int max=0;
        HashSet<Character>hs=new HashSet();
        while(j<s.length()){
            if(hs.add(s.charAt(j))){
                j++;
            }
            else{
               max=Math.max(max,j-i);
                hs.remove(s.charAt(i++));
                
            }
            
        }
        return Math.max(max,j-i);
    }
}
