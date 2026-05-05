class MyCircularQueue {
    private int[] queue;
    private int front = 0;
    private int rear = -1;
    private int itemCount = 0;
    private int MAX;
    public MyCircularQueue(int k) {
        this.MAX = k;
        this.queue = new int[MAX];
    }
    
    public boolean enQueue(int value) {
        if(!isFull()){
            rear = (rear+1) % MAX;
            queue[rear] = value;
            itemCount++;
            return true;
        }
        return false;
    }
    
    public boolean deQueue() {
        if(!isEmpty()){
            front = ++front % MAX ;
            itemCount--;
            return true;
        }
        return false;
    }
    
    public int Front() {
        if(!isEmpty()){
            return queue[front];
        }
        return -1;
    }
    
    public int Rear() {
        if(!isEmpty()){
            return queue[rear];
        }
        return -1;
    }
    
    public boolean isEmpty() {
        return itemCount==0?true:false;
    }
    
    public boolean isFull() {
        return itemCount==MAX?true:false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */