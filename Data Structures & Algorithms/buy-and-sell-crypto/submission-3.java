class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxprofit = 0;

        for(int i=0;i<prices.length;i++){
            int profit = prices[i] - minPrice;

            maxprofit = Math.max(profit,maxprofit);
            minPrice = Math.min(prices[i],minPrice);
        }

        return maxprofit;
    }
}
