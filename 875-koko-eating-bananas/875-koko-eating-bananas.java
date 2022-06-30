class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int left =1;
       int right = 1000000000 ;
        
        
        while(left < right){
            
            int mid =left +(right-left)/2;
            
           if(canEat(piles,mid,h) ){
               right =mid;
           } 
            else{
                left = mid + 1;
            }
            

        }
        return left;
}
    public boolean canEat(int[] nums,int k,int h){
        int hours =0;
        
        for(int i:nums){
               int div = i/k;
            hours+=div;
        if( i % k != 0){
            hours++;
        }
        }
        
        
           return hours <= h; 
    }
}
  