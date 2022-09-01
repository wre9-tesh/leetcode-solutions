class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int[] res = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            nums[i] = Math.abs(nums[i]);
        }
        
        int l = 0, r = nums.length - 1,j=nums.length-1;
        
        while(l<=r){
            
        if(nums[l] < nums[r]){
            res[j] = nums[r] * nums[r];
            --r;
        }
        
        else{
           res[j] = nums[l] * nums[l];
            l++;
        }    
            
            
            --j;
        }
        
      return res;  
    }
}