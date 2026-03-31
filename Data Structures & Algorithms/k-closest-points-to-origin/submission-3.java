class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Integer> closest = new PriorityQueue<>((a,b)->(points[b][0]*points[b][0]+points[b][1]*points[b][1])-(points[a][0]*points[a][0]+points[a][1]*points[a][1]));
        for(int i = 0; i < points.length; i++){
            if(closest.size()< k)
                closest.add(i);
            else if( points[closest.peek()][0]*points[closest.peek()][0]+points[closest.peek()][1]*points[closest.peek()][1] > points[i][0]*points[i][0]+points[i][1]*points[i][1]){
                closest.poll();
                closest.add(i);
            }
        }
        int[][] out = new int[k][2];
        for(int i = 0; i<k; i++){
            out[i] = points[closest.peek()];
            closest.poll();
        }
        return out;
        

    }
}
