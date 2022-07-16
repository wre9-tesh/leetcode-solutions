class Solution {
    public int uniquePaths(int z, int y) {
        
        
        int n = y+z-2;
        int k= Math.min(z-1,y-1);
        
        
        long res = 1;
        for(int i = 1 ; i<=k ;i++ ){

            res = res * (n-k +i)/i;
            
        }
        
        
        return (int)res;
    }

}