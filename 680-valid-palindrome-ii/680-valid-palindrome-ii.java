class Solution {
    public boolean validPalindrome(String s) {
            
        int i=0;
        int j=s.length()-1;
        
        while(i<j){
  
        if(s.charAt(i)!=s.charAt(j)){
            return isPaliornot(s,i,j-1) || isPaliornot(s,i+1,j);
        }    
            i++;
            j--;
        }
        
       return true; 
    }
    
    boolean isPaliornot(String s,int i,int j){
            
        
        while(i<j){
        
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }    
            i++;
            j--;
        }
        return true;
    }
    
}