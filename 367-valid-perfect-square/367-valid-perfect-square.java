class Solution {
    public boolean isPerfectSquare(int x) {
         if(x == 1){
             return true;
         } 
        long start=1;
        long end=x/2;
        
        while(start <= end ){
                long mid =(start+end)/2;
            
            if(mid*mid == x){
                return true;
            }
            
            else if(mid*mid < x){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            
        }
        
      return false;  
    }
}