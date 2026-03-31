class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> stack = new Stack<>();
        int[] result = new int[temperatures.length];
        //stack pairs : temp, index.
        for(int i = 0; i < temperatures.length; i++){

            int t = temperatures[i];
            while(!stack.empty() && t > stack.peek()[0]){
                result[stack.peek()[1]] = i - stack.peek()[1];
                stack.pop();
            }
            stack.push(new int[] {t, i});
        }
        return result;
    }
}
