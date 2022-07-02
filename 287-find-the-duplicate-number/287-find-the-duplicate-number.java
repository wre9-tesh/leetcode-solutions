class Solution {
    public int findDuplicate(int[] arr) {
         int i = 0;
      
        
        while(i < arr.length){
            
            if(arr[i] !=i+1){
                         if(arr[i] != arr[arr[i]-1]){
                      swap(arr,i,arr[i]-1);
                }
                else{
                    return arr[i];
                }
            
            }
            
            else{
        i++;
            }

            
        }
     return -1;   
    }
  public void swap(int[] arr,int a,int b){
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            
    }    
    }
