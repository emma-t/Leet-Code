class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] sum = new int[2];
        
        for(int i = 0; i < nums.length - 1; i++){
            for(int x = i + 1; x < nums.length; x++){
                if(nums[i] + nums[x] == target){
                    sum[0] = i;
                    sum[1] = x;
                }
            }
        }
        
        return sum;
        
    }
}

//Runtime: 53 ms, faster than 44.33% of Java online submissions for Two Sum.
//Memory Usage: 44.6 MB, less than 77.34% of Java online submissions for Two Sum.
