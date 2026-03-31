class MyCircularQueue {
    public int[] queue;
    public int front = 0;
    public int size = 0;

    public MyCircularQueue(int k) {
        queue = new int[k];
    }
    public boolean enQueue(int value) {
        int n  = (front + size) % queue.length;
        if( size==0 || size != queue.length){
            size++;
            queue[n] = value;
            return true;
        }
        return false;
    }
    
    public boolean deQueue() {
        if(size != 0){
            front = ++front % queue.length;
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
