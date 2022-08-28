class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        int i=0,j=1,n=nums.length;
        
        
    while(i<n && j<n){
        
        while(i<n && nums[i] % 2 == 0 ){
            i+=2;
        }
        while(j<n && nums[j] % 2 == 1){
            j+=2;
        }       
        
        if(i<n && j<n){
            swap(i,j,nums);
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