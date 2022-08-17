class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        String []transformTable={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    HashSet<String>hs=new HashSet();
        int count=0;
    for(String word:words){
        String tt="";
        for(int i=0;i<word.length();i++){
            int d=(int)word.charAt(i);
            tt+=transformTable[d-97];
        }
        hs.add(tt);
    }
        return hs.size();
    }
}