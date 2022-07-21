class Solution {
    public boolean hasAlternatingBits(int n) {
        
        
        int count =2 ;
        while(n > 0){
        
            count = (n & 1);
            
            n >>= 1;
            
            if(count == (n & 1)){
            return false;
            }
            
            
        
        
        }
        
       return true; 
    }
}