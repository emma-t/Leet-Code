class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int[] res = new int[temperatures.length];
        int count = 0;
        
        for(int i = 0; i < temperatures.length - 1; i++){
            
            for(int x = i + 1; x < temperatures.length; x++){
                
                if(temperatures[x] > temperatures[i]){
                    res[count] = x-i;
                    x++;
                    break;
                }
                
                
            }
            count++;
            res[count] = 0;
            
        }
        
        return res;
        
    }
}

//Runtime: 2293 ms, faster than 5.00% of Java online submissions for Daily Temperatures.
//Memory Usage: 117 MB, less than 80.28% of Java online submissions for Daily Temperatures.
