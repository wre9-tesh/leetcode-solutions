class Solution {
    public int[] twoSum(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        
      while(start < end){
            int total = nums[start]+nums[end];
            
          if(total < target){
              start++;
          }
          else if(total > target){
              end--;
          }
          else {
                return new int[]{start+1,end+1};
          }
      }
        
        
        return new int[]{start+1,end+1};
    }
}