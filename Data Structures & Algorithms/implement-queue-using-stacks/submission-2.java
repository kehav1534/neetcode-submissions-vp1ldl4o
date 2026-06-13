// using two stacks..
class MyQueue {
    Stack<Integer> s1;
    public MyQueue() {
        s1 = new Stack<>();
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        if(s1.isEmpty()) return -1;
        int x = s1.pop();
        int res = pop();
        if(res==-1){
            return x;
        }
        else{
            s1.push(x);
            return res;
        }
    }
    
    public int peek() {
        if(s1.isEmpty()) return -1;
        int x = s1.pop();
        int res = peek();
        s1.push(x);
        if(res==-1){
            return x;
        }
        else{
            return res;
        }
    }
    
    public boolean empty() {
        if(s1.isEmpty()) return true;
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */