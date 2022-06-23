class Solution {
    public int findFinalValue(int[] nums, int original) {
                int target = original; 
        Arrays.sort(nums);
        while(elementFound(nums,target) == true){               
           target = target * 2;
        }        

       return target ;
    }
    
    public boolean elementFound(int[] nums,int target){
        int start =0;
        int end =nums.length - 1;
        
       while(start<=end){
            
           int mid = start+(end-start)/2;
           
          if(nums[mid] == target){
              return true;
          }
          else if(nums[mid] > target){
              end = mid - 1;
          } 
           else{
               start = mid + 1;
           }
       }  
       return false; 
    }
}