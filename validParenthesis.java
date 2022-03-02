class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<Character>();
        boolean isCorrect=true;
        if(s.length()%2!=0) return false;
     for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
            st.push(s.charAt(i));
            
        }
        if(s.charAt(i)==')'){
            if(!st.empty()&&st.peek()=='('){
                st.pop();
            }else {
                isCorrect=false;
                break;
            }
        }
         if(s.charAt(i)=='}'){
             if(!st.empty()&&st.peek()=='{'){
                 st.pop();
             }
             else {
                 isCorrect=false;
                 break;
             }
             
         }
         if(s.charAt(i)==']'){
             if(!st.empty()&&st.peek()=='['){
                 st.pop();
             }
             else {
                 isCorrect=false;
                 break;
             }

         }
     }
        if(!st.empty()) isCorrect=false;
     return isCorrect;
    }
}
