class Solution {
    public int maxProfit(int[] prices) {
        
        int min = Integer.MAX_VALUE;
        int saved = 0;
        
        for(int i = 0; i < prices.length; i++){
            min = Math.min(min, prices[i]);
            saved = Math.max(prices[i] - min, saved);  
        }
        
        return saved;
    }
}

//Runtime: 3 ms, faster than 73.26% of Java online submissions for Best Time to Buy and Sell Stock.
//Memory Usage: 76.6 MB, less than 77.76% of Java online submissions for Best Time to Buy and Sell Stock.
