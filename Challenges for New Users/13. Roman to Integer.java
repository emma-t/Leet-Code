class Solution {
    public int romanToInt(String s) {
        
        int l = s.length();
        int r = 0;
        
        for(int i = 0; i < l; i++){
            if(s.length()-i >= 2 && s.charAt(i) == 'C' && s.charAt(i+1) == 'M'){
                r += 900;
                i++;
            }
            else if(s.length()-i >= 2 && s.charAt(i) == 'C' && s.charAt(i+1) == 'D'){
                r += 400;
                i++;
            }
            else if(s.charAt(i) == 'M'){
                r += 1000;
            }
            else if(s.length()-i >= 2 && s.charAt(i) == 'X' && s.charAt(i+1) == 'L'){
                r += 40;
                i++;
            }
            else if(s.length()-i >= 2 && s.charAt(i) == 'X' && s.charAt(i+1) == 'C'){
                r += 90;
                i++;
            }
            else if(s.charAt(i) == 'X'){
                r += 10;
            }
            else if(s.length()-i >= 2 && s.charAt(i) == 'I' && s.charAt(i+1) == 'V'){
                r += 4;
                i++;
            }
            else if(s.length()-i >= 2 && s.charAt(i) == 'I' && s.charAt(i+1) == 'X'){
                r += 9;
                i++;
            }
            else if(s.length()-i >= 3 && s.charAt(i) == 'I' && s.charAt(i+1) == 'I' && s.charAt(i+2) == 'I'){
                r += 3;
                i += 2;
            }
            else if(s.length()-i >= 2 && s.charAt(i) == 'I' && s.charAt(i+1) == 'I'){
                r += 2;
                i++;
            }
            else if(s.charAt(i) == 'I'){
                r += 1;
            }
            else if(s.charAt(i) == 'D'){
                r += 500;
            }
            else if(s.charAt(i) == 'C'){
                r += 100;
            }
            else if(s.charAt(i) == 'L'){
                r += 50;
            }
            else if(s.charAt(i) == 'V'){
                r += 5;
            }
        }
        
        return r;
        
    }
}
