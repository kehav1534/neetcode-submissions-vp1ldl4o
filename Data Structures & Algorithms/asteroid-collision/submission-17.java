class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < asteroids.length; i++){
            boolean isDestroyed = false;
            while(!stack.empty() && asteroids[i] < 0 && stack.peek() > 0){
                if((asteroids[i] == -stack.peek())){
                    isDestroyed = true;
                    stack.pop();
                    break;
                }
                else if( -asteroids[i] > stack.peek() ){
                    stack.pop();
                }
                else if(-asteroids[i] < stack.peek()){
                    isDestroyed = true;
                    break;
                }
                else break;
            }
            if( !isDestroyed )
                stack.push(asteroids[i]);
        }
        int[] result = new int[stack.size()];
        for(int i = stack.size()-1; i >= 0 ; i--){
            result[i] = stack.pop();
        }
        return result;  
    }
}