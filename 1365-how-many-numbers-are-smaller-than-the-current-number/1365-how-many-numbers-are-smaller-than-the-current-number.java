class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];
        
        int res[] = new int[nums.length];
        
        
        for(int i=0; i< nums.length;i++){
                count[nums[i]]++;
        }
        
        for(int j = 1 ;j<100;j++){
                count[j] += count[j-1];
        }
        
            
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]  == 0){
                res[i]  =0;
            }
            else{
                res[i] = count[nums[i] - 1];
            }
            
            
        }        
        
        
        
        return res;
    }
}