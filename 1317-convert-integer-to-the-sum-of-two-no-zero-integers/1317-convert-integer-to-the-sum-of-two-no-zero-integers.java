class Solution {
    public int[] getNoZeroIntegers(int n) {
        if(n == 2){
        return new int[] {1,1};
        }
        
            for(int i = 1 ;i<n/2;i++){
                if(checkzero(i) && checkzero(n-i)){
                    return new int[] {i,n-i};
                }
            }
        
        
        return new int[] {-1,-1};
    }
    
    boolean checkzero(int n){
        while(n>0){
                if(n% 10 == 0){
                    return false;
                }
                n /= 10;
        }
    
    
    return true;
    }
    
}