class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        int i=0,j=0,k = 0;
        
        
        while(k<arr2.length){
            
            while(j<arr1.length){
                
             if(arr1[j] == arr2[k]){
                 
                 swap(arr1,i,j); 
                 i++;
                
             }
              
            j++;                   
                    
            }
            
         j = i ;
                        
        k++;
        }
        
        
        Arrays.sort(arr1,i,arr1.length);
        
        
        return arr1;
    }
    
    public void swap(int[] nums,int a,int b){
        
        int temp = nums[a];
        nums[a] = nums[b];        
        nums[b] = temp;
    }
}