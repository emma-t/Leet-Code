class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int start = 0;
        int end = nums.length - 1;
        
        while (start <= end) {
            
            int m = (start + end) / 2;
            
            if (target == nums[m]) {
                return m;
            } 
            
            else if (target < nums[m]) {
                end = m - 1;
            } 
            
            else {
                start = m + 1;
            }
            
        }
        return start;
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
//Memory Usage: 43.4 MB, less than 50.16% of Java online submissions for Search Insert Position.
