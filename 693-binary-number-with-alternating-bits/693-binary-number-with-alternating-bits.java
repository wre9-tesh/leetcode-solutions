class Solution {
    public boolean hasAlternatingBits(int n) {
        
        
        int y = n >> 1;
        
        int a = (n ^ y) + 1 ;

       return (a & (a-1)) == 0; 
    }
}