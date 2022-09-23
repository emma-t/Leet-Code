class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int sum = 0;
        int count = 0; 
        
        for(int i = 0; i < accounts.length; i++){
            
            for(int x = 0; x < accounts[0].length; x++){
                count += accounts[i][x];
            }
            
            if(count > sum){
                sum = count;
            }
            
            count = 0;
        }
        
        return sum;
        
    }
}

//Runtime: 1 ms, faster than 62.07% of Java online submissions for Richest Customer Wealth.
//Memory Usage: 43.4 MB, less than 36.84% of Java online submissions for Richest Customer Wealth.
