class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        int i=0,j=nums.length-1;
        
        
    while(i<nums.length-1){
         
        if(i % 2 == 0 && nums[i] % 2 == 0){
            i++;
            j =nums.length - 1;

        }
        
        else if(i % 2 == 0 && nums[i] % 2 != 0){
            swap(i,j,nums);
            j--;
        }
        
        else if(i % 2 != 0 && nums[i] % 2 != 0){
            i++;
            j =nums.length - 1;
        }
        
        else{
            swap(i,j,nums);
            j--;
        }
       
    }
        
 
        return nums;
    }
    public void swap(int a,int b,int[] nums){

        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
        
    }
}