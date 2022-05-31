class Solution {
    public int countTriples(int n) {
        int count=0;
        
        
        for(int i=1;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                int c=(i*i) + (j*j);
                int sq = (int)Math.sqrt(c) ;  
            
                
                if(sq*sq == c  && sq <= n){
                    count+=2;
                }
            }
            
        }
        
        
        
        
        
       return count; 
    }
}