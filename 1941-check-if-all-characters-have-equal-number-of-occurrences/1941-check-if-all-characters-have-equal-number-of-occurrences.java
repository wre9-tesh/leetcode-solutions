class Solution {
    public boolean areOccurrencesEqual(String s) {
     int[] freq=new int[26];
        
        for(char c:s.toCharArray()){
    
            freq[c-'a']++;
            
        }
        
        int prev=freq[s.charAt(0)-'a'];
        
        for(int i:freq){
            if(i!=0 && i != prev){
                return false;
            }
            
        }
        return true;
    }
}