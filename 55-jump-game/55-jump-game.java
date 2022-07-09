class Solution {
    public boolean canJump(int[] nums) {
        
        int n = nums.length ;
        
        int Currmax = nums[0];
        
        
        for(int i=0;i < n ;i++ ){
            
            if(Currmax < i){
                return false;
            }
            
            Currmax = Math.max(Currmax,i+nums[i]);
            
        }
        
        
        
        
        return true;
    }
}