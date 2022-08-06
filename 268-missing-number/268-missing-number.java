class Solution {
    public int missingNumber(int[] arr) {
    
        int count=0;
    
    Arrays.sort(arr);

         for(int i:arr){
             
             if(count!= i){
                break;
             }
             
             count++;
             
         }  
        
      return count;
    }
}