class StockSpanner {
    Stack<Integer> stack;
    public StockSpanner() {
        stack = new Stack<>();
    }
    public int next(int price) {
        stack.push(price);
        Stack<Integer> temp = (Stack<Integer>)stack.clone();
        int count = 0;
        while(!temp.empty() && temp.peek() <= price){
            count++;
            temp.pop();
        }
        // Stack<Integer> n = stack;
        // while(!n.empty()){
        //     System.out.println(n.pop());
        // }
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */