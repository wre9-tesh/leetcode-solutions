class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        
        int left  = 1;
        int right =0;
        
        for(int i:nums){  
            right = Math.max(right,i);    
        }
        
        while(left < right){
            
            int mid = left + (right - left) / 2;
            int sum = sumEl(nums,mid);
            
            if(sum > threshold){
       
                 left = mid + 1;
            }
            else{
          right = mid;
            }
            
        }
        
        return right;
    }
    
    public int sumEl(int[] arr ,int divisor){
        int sum=0;
        for(int i:arr){
           sum += (i + divisor - 1) / divisor;
        }
        return sum;
    }
    
}