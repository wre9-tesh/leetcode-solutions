class Solution {
    public int bitwiseComplement(int n) {
        if(n ==0){
            return 1;
        }
        int i =0,j=0;
        while(n != 0){
            
            if((n&1)== 0){
             i += Math.pow(2,j);
            } 
            
            n >>= 1;
            
            j++;
        }
        
        
        
        return i;
    }
}