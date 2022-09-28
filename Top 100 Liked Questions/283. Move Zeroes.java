class Solution {
    public void moveZeroes(int[] nums) {
        
        int x = 0;
        
        for(int i = 0; i < nums.length; i++) {
            
            if(nums[i] != 0) {
                
                int temp = nums[x];
                nums[x] = nums[i];
                nums[i] = temp;
                
                x++;
                
            }
        }
        
    }
}

//Runtime: 13 ms, faster than 15.13% of Java online submissions for Move Zeroes.
//Memory Usage: 55 MB, less than 26.50% of Java online submissions for Move Zeroes.
