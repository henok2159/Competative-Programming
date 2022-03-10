class Solution {
    public String decodeString(String s) {
        Stack <String>stack=new Stack();
      //  Stakc<Integer>s2=new Stack();
        String cc="";
        String ccc="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==']'){
                cc="";
                ccc="";
                while(!Objects.equals(stack.peek(),"[")){
                   cc=stack.pop()+cc; 
                }
                stack.pop();
                int d=Integer.parseInt(stack.pop());
                for(int j=0;j<d;j++){
                    ccc=ccc+cc;
                }
                stack.push(ccc);
                
            }
            else if(Character.isDigit(s.charAt(i))){
                cc="";
                while(Character.isDigit(s.charAt(i))){
                    cc=cc+s.charAt(i);
                    i++;
                }
                i--;
                stack.push(cc);
               
            }else stack.push(Character.toString(s.charAt(i)));
            
        }
        ccc="";
        while(!stack.empty()){
            ccc=stack.pop()+ccc;
        }
    return ccc;
    }
}
