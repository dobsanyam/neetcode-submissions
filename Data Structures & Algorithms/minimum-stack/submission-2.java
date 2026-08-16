class MinStack {

Stack<Integer> s = new Stack<>();
Stack<Integer> s2 = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        
        s.push(val);
        if(!s2.empty()){
            if(s2.peek()>=val)
                s2.push(val);
        }
        else {
            s2.push(val);
        }
    }
    
    public void pop() {
        
        if(!s2.empty() && s2.peek().equals(s.peek())){
            
            s2.pop();
        }
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return s2.empty() ? s.peek() : s2.peek();
    }
}
