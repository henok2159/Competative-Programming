class Solution {
    public int longestPalindrome(String s) {
        int n=s.length();
        int longest=0;
        HashMap<Character,Integer>hm=new HashMap();
        
        for(int i=0;i<n;i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
            if(hm.get(s.charAt(i))==2){
                longest+=2;
                hm.put(s.charAt(i),0);
            }
        }
        // for(int i=0;i<n;i++){
        //    int rep= hm.get(s.charAt(i));
        //     hm.put(s.charAt(i),0);
        //     if(rep%2==0)longest+=rep;
        //     else longest+=rep-1;
        // }
        if(longest<n)
            return longest+1;
        else return longest;
    }
}