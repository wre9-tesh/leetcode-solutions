class Solution {
    public int[] sortArrayByParity(int[] nums) {
       
        int i=0,even=0,odd=0,j=nums.length-1;
        
        for(int k=0;k<nums.length;k++){
            if(nums[k]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        
        while(i<even){
            if(nums[i] % 2 == 0){
                i++;
            }
            else{
                swap(nums,i,j);
                j--;
            }
            
         
        }
         return nums;  
    }
    public void swap(int[] nums,int a,int b){
        int temp =nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}