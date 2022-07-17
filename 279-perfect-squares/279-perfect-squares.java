class Solution {
    public int numSquares(int n) {
        
        if(isSquare(n)){
            return 1;
        }
        
        int sqrt =(int)Math.sqrt(n);
        
        for(int i=0;i<=sqrt;i++){
            
            if(isSquare(n-(i*i))){
                return 2;
            }
            
        }
        
        while((n & 3) == 0){
        
            n >>= 2;}
            
            if((n & 7) == 7){
                return 4;
            }
                
        
        
    
        return 3;
    }
    
    public boolean isSquare(int n){
        
        int a = (int)Math.sqrt(n);
        
    
        return (a * a) == n;      
    }
}