class MyHashSet {
    private List<Integer> set;
    public MyHashSet() {
        this.set = new ArrayList<>();
    }
    
    public void add(int key) {
        if(!contains(key))
            this.set.add(key);
    }
    
    public void remove(int key) {
        this.set.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        return this.set.contains(key)?true:false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */