class Solution {
    public int majorityElement(int[] nums) {
        
        int count = 0;
        
        for(int i = 0; i < nums.length-1; i++){
            for(int x = i+1; x < nums.length; x++){
                if(nums[i] == nums[x]){
                    count++;
                }
            }
            if(count == nums.length/2){
                return nums[i];
            }
            count = 0;
        }
        
        return nums[0];
    }
}

//Runtime: 2005 ms, faster than 5.00% of Java online submissions for Majority Element.
//Memory Usage: 56.7 MB, less than 19.20% of Java online submissions for Majority Element.
