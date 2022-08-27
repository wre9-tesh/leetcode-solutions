class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int counter = 0 ;
        if(nums.length < 3){
            return nums[nums.length-1];
        }
        
       int i = nums.length - 2;
           
        while(i>=0 && counter < 2){
            
            if(nums[i+1] != nums[i]){
                counter++;
            }
            
            
            --i;
        }
        
        if(counter == 2){
            return nums[i+1];
        }
        
       
      return nums[nums.length-1];  
    }
}