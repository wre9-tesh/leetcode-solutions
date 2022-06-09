class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i=0;i<nums.length - 1;i++){
             int start=i+1;
             int end=nums.length - 1;
            while(start<=end){
                
                int mid = start + (end-start)/2;
                int total = nums[mid] + nums[i];
                if(total < target){
                    start = mid + 1;
                }
                else if(total > target){
                    end = mid - 1;
                }
                else{
                    return new int[]{i+1,mid+1};
                }
            }
        }
        
        
        
        return new int[]{-1,-1};
    }
}