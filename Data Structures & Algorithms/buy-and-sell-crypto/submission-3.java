class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int l = 0;
        int r = 0;

        for(int i = 0; i < prices.length; i++){

            if(prices[i] < prices[l]){
                l = i;

            }
            else if(prices[i]-prices[l] > maxProfit){
                r = i;
                maxProfit = Math.max(maxProfit, prices[r]-prices[l]);
            }
        }
        return maxProfit;
    }
}
