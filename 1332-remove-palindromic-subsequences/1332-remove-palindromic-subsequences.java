class Solution {
    public int removePalindromeSub(String s) {
       if(isPali(s,0,s.length()-1)){
            return 1;
        }
        
        
        return 2;
    }
    
    public boolean isPali(String s,int i,int j){
        
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }    
            i++;
            j--;
        }
        
    return true;
    }
}