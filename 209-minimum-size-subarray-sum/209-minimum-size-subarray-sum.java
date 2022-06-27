class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min=Integer.MAX_VALUE,sum=0,i=0,j=0;
        
        
        while(i< nums.length){
            
            sum+=nums[i];
            i++;
            
            while(sum >= target){
                    min = Math.min(min,i-j);
                    
                sum-=nums[j];
                j++;
            }
        }
        
        
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}