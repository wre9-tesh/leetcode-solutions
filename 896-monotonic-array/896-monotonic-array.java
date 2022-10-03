class Solution {
    public boolean isMonotonic(int[] nums) {
        
    boolean inc = monoinc(nums);
    boolean dec = monodec(nums);    
        
      return inc || dec;
    }
    
    public boolean monoinc(int[] nums){
        for(int i=1;i<nums.length;i++){
            if(nums[i] < nums[i-1]){
                return false;
            }
        }
        
      return true;  
    }
    
      public boolean monodec(int[] nums){
        for(int i=1;i<nums.length;i++){
            if(nums[i] > nums[i-1]){
                return false;
            }
        }
        
      return true;  
    }
    
}