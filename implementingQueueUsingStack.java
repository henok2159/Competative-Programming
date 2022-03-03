class MyQueue {
    Stack<Integer>st1;
    Stack<Integer> st2;
    public MyQueue() {
        st1=new Stack<Integer>();
        st2=new Stack<Integer>();
    }

    public void push(int x) {

        st1.push(x);

    }

    public int pop() {
        int d;
        while(!st1.empty()){
            st2.push(st1.pop());

        }
       // if(st2.empty())
        d=st2.pop();

        while(!st2.empty()){
            st1.push(st2.pop());
        }
        return d;
    }

    public int peek() {
        int d;
        while(!st1.empty()){
            st2.push(st1.pop());

        }
        d=st2.peek();

        while(!st2.empty()){
            st1.push(st2.pop());
        }
        return d;
    }

    public boolean empty() {
        if(st1.empty()&&st2.empty()){
            return true;
        }
        return false;
    }
}
