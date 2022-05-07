class Solution {
    public void sortColors(int[] nums) {
        int i=0,j=nums.length-1;
        
        while(i<j){
            if(nums[i] == 0){
        i++;
            }
            else{
                swap(nums,i,j);
                j--;
            }
        }
        j=nums.length-1;
        while(i<j){
        if(nums[i] == 2 ){
            swap(nums,i,j);
            j--;
        }
         else{
             i++;
         }   
        
        }
    }
    public void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;        
    }
}