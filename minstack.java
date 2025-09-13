class MinStack {
    public Stack<Integer> s;
    public Stack<Integer> mini;
    public MinStack() {
         s=new Stack<>();
         mini=new Stack<>();    
    }    
    public void push(int val) {
        s.push(val);
        if(mini.isEmpty() || val<=mini.peek()){
            mini.push(val);   
        }        
    }   
    public void pop() {
        int val =s.pop();
        if(val==mini.peek()){
            mini.pop();
        }        
    }    
    public int top() {
        return s.peek();
        
    }    
    public int getMin() {
        return mini.peek();        
    }
}
