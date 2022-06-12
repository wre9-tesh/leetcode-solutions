class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        
     int ans=0;
        
       for(int i=0 ;i<arr.length;i++){
            for(int j=i;j<arr.length;j+=2){
                int k=i;
                while(k <= j){
                    ans+=arr[k];
                    k++;
                }
            }
        
       } 
    
        
       return ans; 
    }
}