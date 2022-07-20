class Solution {
    public int singleNumber(int[] nums) {
        
        int res =0;
        
        for(int i=0;i<32;i++){
            int u=0;
            
            for(int n:nums){
                n >>=i;
                u+= (n & 1);  
            }
            
             u %= 3;
            
            u <<= i;
                
            res+=u;
            
        }
        
        
        
      return res;
    }
}