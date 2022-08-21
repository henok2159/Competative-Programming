class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>stack=new Stack();
        
        
        for(int i=0;i<asteroids.length;i++){
             boolean c=true;
            if(asteroids[i]>0){
                stack.push(asteroids[i]);
            }
            
            else{
                    
                     while(!stack.isEmpty()&&c){
                        if(stack.peek()<0){
                            stack.push(asteroids[i]);
                            c=false;
                        }
                         else if(stack.peek()+asteroids[i]==0){
                             stack.pop();
                             c=false;
                         }
                         else if(stack.peek()+asteroids[i]>0){
                             c=false;
                         }
                         else {
                             stack.pop();
                         }
                
            }
            }
                       if(stack.isEmpty()&&c){
                     stack.push(asteroids[i]);
            }
          
        }
        int s=stack.size();
        int []a=new int[s];
        for(int i=s-1;i>=0;i--){
            a[i]=stack.pop();
        }
        return a;
    }
}