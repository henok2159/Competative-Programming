class Solution {
    public String sortSentence(String s) {
        int leading=0;
        int suffix=0;
        String [] sentence= new String[200];
        for(int i=0;i<s.length();i++){

            if(s.charAt(i)==' '||i==s.length()-1){
                String ind;
                if(s.charAt(i)==' '){
                    ind=Character.toString(s.charAt(i-1));
                    suffix=i-1;
                }else{
                     ind=Character.toString(s.charAt(i));
                    suffix=i;
                }

                int index=Integer.parseInt(ind);

                sentence[index]=s.substring(leading,suffix);
                leading=i+1;
            }


        }
        String ff="";
        for(int i=1;i<sentence.length;i++){
            if(sentence[i]!=null){
                ff=ff+sentence[i];
            }
            if(sentence[i+1]!=null){
                ff=ff+" ";
            }
           else break;
        }
        return ff;
    }
}
