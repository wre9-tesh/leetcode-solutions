class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
            int count=0;
            int sum = 0;
            int i=0,j=nums.length - 1;
        while(i<j){
                sum= nums[i]+nums[j];
                
                if(sum == k){
                    count++;
                    i++;
                    j--;
                }
                else if(sum > k){
                    j--;
                }
                else{
                    i++;
                }
        }
        
return count;
    }
}