class Solution {
    public int findComplement(int n) {
        if(n == 0){
            return 1;
        }
        
        int a = Integer.toBinaryString(n).length() ;
        
        a = (1 << a) - 1 ;
        
        return n ^ a;
    }
}