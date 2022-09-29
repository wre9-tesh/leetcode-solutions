class Solution {
    public int rob(int[] nums) {
       int in = nums[0];
        int ex = 0;
        int ex_new;
        
        for(int i=1;i<nums.length;i++){
            ex_new = (in>ex)?in:ex;
            in = ex + nums[i];
            ex = ex_new;
        }
        
        return (in>ex)?in:ex;
    }
}