class Solution {
    public boolean canConstruct(String rn, String mg) {
      
        int[] arr = new int[26];
        
        
        for(int i=0;i<mg.length();i++){
            
            arr[mg.charAt(i) - 'a']++;
            
        }
        
        for(int j = 0;j<rn.length();j++){
         
            if(--arr[rn.charAt(j) - 'a'] < 0){
                return false;
            }
            
            
        }
        
        return true;
    }
}