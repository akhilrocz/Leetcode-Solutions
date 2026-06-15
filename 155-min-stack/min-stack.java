class MinStack {
private Deque<Integer> stk =new ArrayDeque<>();
private Deque<Integer> minStk =new ArrayDeque<>();
    public MinStack() {
        minStk.push(Integer.MAX_VALUE);
    }
    
    public void push(int value) {
        stk.push(value);
        if(minStk.isEmpty()){
            minStk.push(value);
 }else{
        minStk.push(Math.min(value,minStk.peek()));
 }
       
    }
    
    public void pop() {
        stk.pop();
        minStk.pop();
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
       return minStk.peek();
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */