class MyCircularQueue {
    public int[] queue;
    public int front = 0;
    public int size = 0;
    public MyCircularQueue(int k) {
        queue = new int[k];
    }
    public boolean enQueue(int value) {
        int n  = (front + size) % queue.length;
        if(size==0) {queue[n] = value; size++; return true; }
        else if(  n != front && size != queue.length){
            size++;
            queue[n] = value;
            return true;
        }
        return false;
    }
    
    public boolean deQueue() {
        if(size != 0){
            front = (front+1)%queue.length;
            size--;
            return true;
        }
        return false;
    }
    
    public int Front() {
        if(size!=0){
            return queue[front];
        }
        return -1;
    }
    
    public int Rear() {
        if(size > 0){
            return queue[(front+size-1)%queue.length];
        }
        return -1;
    }
    
    public boolean isEmpty() {
        if(size==0) return true;
        return false;
    }
    
    public boolean isFull() {
        return size==queue.length ? true : false;
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