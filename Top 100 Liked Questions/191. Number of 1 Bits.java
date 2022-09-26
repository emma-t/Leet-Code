public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {

        int count = 0;
        
        String num = Integer.toBinaryString(n);
        
        int length = num.length();
        
        for(int i = 0; i < length; i++){
            if(num.charAt(i) == '1'){
                count++;
            }
        }
        
        return count;
    }
}

//Runtime: 2 ms, faster than 21.08% of Java online submissions for Number of 1 Bits.
//Memory Usage: 41.3 MB, less than 46.77% of Java online submissions for Number of 1 Bits.
