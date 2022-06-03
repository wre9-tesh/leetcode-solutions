class Solution {
    public boolean validPalindrome(String s) {
     int i=0,j=s.length()-1;
        
        
        while(i<j){
            
            if(s.charAt(i) != s.charAt(j)){
                return (isPalindrome(s,i,j-1) || isPalindrome(s,i+1,j));
            }
            
            
            i++;
            j--;
        }
        
     
        
    return true;
    }
     public boolean isPalindrome(String s,int i,int j) {
     
        
        while(i<j){
            char start=s.charAt(i);
            char end=s.charAt(j);
        
            if(start!=end){
            return false;
            }
                i++;
                j--;
            
        }
        return true;
        
    }
}