class Solution {
    public int evalRPN(String[] tokens) {
    Stack <String> st1=new Stack<String>();
        Stack<String>st2=new Stack<String>();
        for(int i=tokens.length-1;i>=0;i--){
            st1.push(tokens[i]);
        }

        while(!st1.empty()){
            String a=st1.pop();
          if(a.length()==1&&!Character.isDigit(a.charAt(0))){
              if(st2.size()>1){
              int ans;
              int op1=Integer.parseInt(st2.pop());
              int op2=Integer.parseInt(st2.pop());
              ans = switch (a) {
                  case "+" -> op2 + op1;
                  case "-" -> op2 - op1;
                  case "*" -> op2 * op1;
                  default -> op2 / op1;
              };
              st2.push(Integer.toString(ans));

          }}
          else{
              st2.push(a);
          }
        }
return  Integer.parseInt(st2.pop());
        
    }
}
