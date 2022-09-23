class Solution {
    public int numberOfSteps(int num) {
        
        int steps = 0;
        
        while(num != 0){
            if(num%2 == 0){
                num = num/2;
            }
            else{
                num = num-1;
            }
            steps += 1;
        }
        
        return steps;
        
    }
}

//Runtime: 1 ms, faster than 72.55% of Java online submissions for Number of Steps to Reduce a Number to Zero.
//Memory Usage: 40.7 MB, less than 67.90% of Java online submissions for Number of Steps to Reduce a Number to Zero.
