class Solution {
    public int[] sortArray(int[] nums) {

        nums = sort(nums);
    
       return nums;  
    }
    
    
    public int[] sort(int[] arr){
    
        
        if(arr.length == 1){
            return arr;
        }
        
        int mid = arr.length/2;
        
        int[] left = sort(Arrays.copyOfRange(arr,0,mid));
        int[] right = sort(Arrays.copyOfRange(arr,mid,arr.length));
        
        
            return merge(left,right);
    }
  
  public int[] merge(int[] left ,int[] right){
     
      int[] mix = new int[left.length+right.length];
      
      int i=0,j=0,k=0;
      
      while(i < left.length && j < right.length ){
    
          if( left[i] < right[j] ){
              mix[k] = left[i];
              i++;
          }
          
          else{
              mix[k] = right[j];
              j++;
          }
            
          k++;
         
      }
        
          while(i < left.length){
              mix[k] = left[i];
              i++;
              k++;
          }
           while(j < right.length){
              mix[k] = right[j];
              j++;
              k++;
          }  
      
      
     return mix;  
  }  
}