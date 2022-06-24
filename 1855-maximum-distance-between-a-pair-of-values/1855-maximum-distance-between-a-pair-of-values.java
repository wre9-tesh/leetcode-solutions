class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
      
       int max_val =0;
        
      for(int i=0 ; i<nums1.length;i++){
                int start = i ;
                int end = nums2.length-1;
          
          while(start<=end){
                int mid = start+(end-start)/2;
              
             if(nums2[mid] < nums1[i]){
                 end = mid - 1;
             } 
             else {
                 max_val = Math.max(max_val,(mid - i));
                 start = mid + 1;
             } 
              
          }
        
      
      }  
       
    
    return max_val;    
    }
}