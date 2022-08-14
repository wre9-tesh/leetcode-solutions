class Solution {
    public double myPow(double x, int n) {
     
        if(x == 1){
            return 1;
        }
        
        
        double ans = helper(x,n);
        return  n > 0 ? ans: 1/ans;
    }
    
     public double helper(double x, int n){
               
        int exp = Math.abs(n);
         
             if(exp == 0 )
             {    
             return 1;
             }
           
             if(exp % 2 == 0){
             return helper(x*x,exp/2);
             }
        
          return  x * (helper(x*x,(exp-1)/2));
     }         
}