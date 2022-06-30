class Solution {
    public int minMoves2(int[] nums) {
        int start =0;
        int end = nums.length - 1;
        Arrays.sort(nums);
        int steps = 0;
     int mid = start+(end-start)/2;
       
        for(int i=0;i<nums.length;i++){
            
             steps += Math.abs(nums[mid] - nums[i]);
        }
        
        return steps;
    }
}