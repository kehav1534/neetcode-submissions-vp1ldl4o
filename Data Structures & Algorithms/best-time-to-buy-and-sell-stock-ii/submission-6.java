class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int smallest = 10000;
        for(int i = 0; i < prices.length; i++){
            smallest = Math.min(smallest, prices[i]);
            if(smallest < prices[i]){
                profit = profit + prices[i]-smallest;
                smallest = prices[i];
            }
        }
        return profit;
    }
}