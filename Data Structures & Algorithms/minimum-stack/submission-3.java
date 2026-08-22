class MinStack {

    public Stack<Integer> s1;
    public Stack<Integer> minStack;
    public MinStack() {
        s1 = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        s1.push(val);

        if(minStack.isEmpty() || val<=minStack.peek()){
            minStack.push(val);
        }
    }
    
    public void pop() {
        int removed = s1.pop();
        if(removed == minStack.peek()){
            minStack.pop();
        }
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
