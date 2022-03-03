class MinStack {
    Stack<Integer> st1;
    Stack <Integer>st2;

    public MinStack() {
        st1=new Stack<Integer>();
        st2=new Stack<Integer>();
    }
    
    public void push(int val) {
        if(st2.empty()||st2.peek()>=val){
            st2.push(val);
        }
        st1.push(val);
    }
    
    public void pop() {
    if(st1.peek().equals(st2.peek())){
st2.pop();}
        st1.pop();
    }
    
    public int top() {
        
      return  st1.peek();
        
    }
    
    public int getMin() {
       
        return st2.peek();
}}
