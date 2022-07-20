class Solution {
    public int singleNumber(int[] nums) {
     int j = 0;
        for(int i=0;i<nums.length;i++){
         
            j^= nums[i];
            
            
        }

        return j;
    }
}