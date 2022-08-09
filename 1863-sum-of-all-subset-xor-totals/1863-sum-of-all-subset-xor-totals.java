class Solution {
    public int subsetXORSum(int[] nums) {
        
    int ans = helper(nums,0,0);        
       
        return ans;
    }
    
    
    public int helper(int[] nums,int p,int index){
        
        if(index >= nums.length){
            return p;
        }
        
        
        int n1 = helper(nums,p^nums[index],index+1);
        int n2 = helper(nums,p^0,index+1);
        
        return n1 + n2;
        
    }
}