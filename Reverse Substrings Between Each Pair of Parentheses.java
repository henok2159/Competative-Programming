class Solution {
    public String reverseParentheses(String s) {
       Queue<Character> queue=new ArrayDeque<Character>() ;
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                while(stack.peek()!='('){

                    queue.add(stack.pop());
                }

                    stack.pop();
                    while (!queue.isEmpty()){

                        stack.push(queue.remove());

                }
            }
            else
                stack.push(s.charAt(i));
        }
        String ss="";
        while (!stack.empty()){
            
            ss=Character.toString(stack.pop())+ss ;}


return ss; 
    }
}
