class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length == 1 || k == 1 ){
            return 0;
        }
        int res = Integer.MAX_VALUE;
  
        Arrays.sort(nums);
        
        for(int i = k -1 ;i<nums.length ;i++){
            res = Math.min(res,nums[i] - nums[i-k+1]);
        }
        

        return res;    
    }
}