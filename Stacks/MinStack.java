class MinStack {

    /** initialize your data structure here. */
    int[] stack = new int[50000];
    int top;
    public MinStack() {
        top = -1;
        
    }
    
    public void push(int x) {
        stack[++top] = x;
        
    }
    
    public void pop() {
        
       int a = stack[top--];
        
    }
    
    public int top() {
        return stack[top];
    }
    
    public int getMin() {
        int min = 0;
        min = top();
        for(int i=(top-1);i>=0;i--)
        {
            if(stack[i]<min)
            {
                min = stack[i];
            }
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
