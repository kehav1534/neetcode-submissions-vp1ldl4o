class StockSpanner {
    Stack<int[]> stack;
    //stored : val, count
    public StockSpanner() {
        stack = new Stack<>();
    }
    public int next(int price) {
        int count = 1;
        while(!stack.empty() && stack.peek()[0] <= price){
            count+= stack.pop()[1];
        }
        stack.push(new int[] {price, count});
        return stack.peek()[1];
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */