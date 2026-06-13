class MyStack {
    List<Integer> q;
    public MyStack() {
        q = new ArrayList<>();
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        if(!empty()){
            return q.remove(q.size()-1);
        }
        return -1;
    }
    
    public int top() {
        if(!empty()){
            return q.getLast();
        }
        return -1;
    }
    
    public boolean empty() {
        if(q.size()==0) return true;
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */