class Solution {
    public int uniquePaths(int z, int y) {
        
       int total_move = z + y - 2;
       
       int k = Math.min(z-1,y-1);
       
    long res = 1;
        
       for(int i =1 ; i<=k ;i++ ){
           
           res = res * (total_move -k+i)/i ;
           
       } 
        
        
        
        
        return (int) res; 
    }

}