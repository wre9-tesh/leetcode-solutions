class Solution {
    public int binaryGap(int n) {
       
        if( (n & (n-1) )== 0){
            return 0;
        }
        
        int count =0,max=0,pos=-1;
        
        while(n > 0){
            
            if((n & 1 )== 1){
                
                if(pos != -1)
                max = Math.max(max,count);
                count = 0;   
                pos = 0;
            }

            count++;

            n >>= 1;
            
        }
        
        
        return max;
    }
}
    
        
   