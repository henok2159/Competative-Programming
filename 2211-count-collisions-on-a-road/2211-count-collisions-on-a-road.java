class Solution {
    public int countCollisions(String directions) {
        Stack<Character>stack=new Stack();
        int count=0;
        for(int i=0;i<directions.length();i++){
            if(directions.charAt(i)=='R'){
                stack.push(directions.charAt(i));
            }
            else if(directions.charAt(i)=='L'){
                if(!stack.isEmpty()&&stack.peek()=='R'){
                    count+=2;
                    stack.pop();
                    stack.push('S');
                }
               else if(!stack.isEmpty()&&stack.peek()=='S'){
                    count+=1;
                }
            }
            else {
                stack.push('S');
            }
        }
        boolean canStop=false;
        while(!stack.isEmpty()){
            char d=stack.pop();
            if(d=='S')canStop=true;
            if(canStop&&d=='R')count+=1;
        }
        return count;
        
    }
}