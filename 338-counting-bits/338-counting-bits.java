class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        
            for(int i=0;i<=n;i++){
                
               arr[i] = oneBits(i);     
            }
        
        return arr;
    }
    
    
    public int oneBits(int n){
        int count =0;
        
        
        while(n>0){
            
            n = (n & (n-1));
            count++;
                
        }

        return count;
    }
}