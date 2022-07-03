class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k > bloomDay.length){
            return -1;
        }
        
        int start =0;
        int end = (int)1e9;
        
        while(start<end){
            int mid = start+(end-start)/2;
            
            if(fessible(bloomDay,mid,m,k)){
                end =mid;
            }
            else{
            start = mid +1;
            }
          
        }
                
      return start;  
    }
    public boolean fessible(int[] nums,int mid ,int m , int k){
        
        int flow=0,boq =0;
        
        for(int i:nums){
            
            if(i > mid){
                flow =0;
            }
            else if(++flow >= k){
            boq++;
                flow=0;
            } 
        }
        
        
        return boq >= m;
    }
}