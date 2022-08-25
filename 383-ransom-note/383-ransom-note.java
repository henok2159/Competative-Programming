class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>hm=new HashMap();
        for(int i=0;i<magazine.length();i++){
            char c=magazine.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
       
        for(int i=0;i<ransomNote.length();i++){
            char c=ransomNote.charAt(i);
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)-1);
                if(hm.get(c)==0)hm.remove(c);
            }
            else return false;
        }
        return true;
    }
}