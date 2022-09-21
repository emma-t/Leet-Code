class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        for(int i = 0; i < ransomNote.length(); i++){
            
            if(magazine.contains(Character.toString(ransomNote.charAt(i)))){
                int index = magazine.indexOf(ransomNote.charAt(i));
                magazine = magazine.substring(0, index) + magazine.substring(index + 1);
            }
            
            else{
                
                return false;
            }
        }
        return true;
        
    }
}
