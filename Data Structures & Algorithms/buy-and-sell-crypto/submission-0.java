class Solution {
    public int maxProfit(int[] prices) {
        int buy=0, sell=0, maxProfit=0;

        while(sell<prices.length){
            maxProfit = Math.max(maxProfit, prices[sell]-prices[buy]);
            if(prices[sell]<prices[buy]) buy=sell;
            sell++;
        }
        return maxProfit;
    }
}
