class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==1)return 0;
        int left = 0;
        int right = 1;
        int profit = 0;

        while(left < prices.length && right< prices.length){
            if(prices[left] >= prices[right]){
                left++;
                right++;
                continue;
            }
            while( right+1 < prices.length && prices[right] <= prices[right] && prices[left] >= prices[right]){
                right++;
            }
            if(right < prices.length && prices[left] < prices[right]){
                profit = profit+prices[right] - prices[left];
                left++;
                right++;
            }
        }
        return profit;
    }
}