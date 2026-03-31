class Solution {
    public int maxProfit(int[] prices) {
        int low = 0;
        int high = prices.length-1;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < prices[low] && i < high)
                low = i;
            else if (prices[prices.length-1-i] < prices[low] && prices.length-1-i < high)
                low = prices.length-1-i;
            
            if(prices[i] > prices[high] && i > low)
                high = i;
            else if (prices[prices.length-1-i] > prices[high] && prices.length-1-i > low)
                high = prices.length-1-i;
        }


        // for(int i : prices){
        //     if(i< left){
        //         left = i;
        //     }
        //     if(i > right && i > left){
        //         right = i;
        //     }
        // 
        int profit= prices[high]-prices[low];
        return profit>0? profit:0;
    }
}
