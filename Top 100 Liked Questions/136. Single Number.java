class Solution {
    public int singleNumber(int[] nums) {
        
        boolean found  = false;
        int times = 0;
        
        for(int i = 0; i < nums.length; i++){
            
            for(int x = 0; x < nums.length; x++){
                
                if(nums[i] == nums[x]){
                    times++;
                }
            }
            
            if(times == 1){
                return nums[i];
            }
            
            times = 0;
        }
        
        return nums[0];
        
        
    }
}

//Runtime: 566 ms, faster than 5.30% of Java online submissions for Single Number.
//Memory Usage: 49.9 MB, less than 80.73% of Java online submissions for Single Number.
