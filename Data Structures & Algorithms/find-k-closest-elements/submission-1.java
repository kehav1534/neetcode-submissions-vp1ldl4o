class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        Queue<Integer> queue = new PriorityQueue<>((a,b)-> (((b-x)*(b-x))-((a-x)*(a-x))));
        for(int i = 0; i < arr.length; i++){

            if(queue.size()< k){
                queue.add(arr[i]);
            }
            else{
                int top = queue.peek();
                if(((top-x)*(top-x) > (arr[i]-x)* (arr[i]-x) ) || (top == -arr[i] && top > 0)){
                    queue.poll();
                    queue.add(arr[i]);
                }
            }

        }
        List out = new ArrayList<>(queue);
        Collections.sort(out);
        return out;
    }
}