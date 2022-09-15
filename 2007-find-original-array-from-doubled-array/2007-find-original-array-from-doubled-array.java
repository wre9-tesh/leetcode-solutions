class Solution {
    public int[] findOriginalArray(int[] arr) {
        
        int len = arr.length;
        int[] ans = new int[len/2];
        if(len % 2 != 0){
            return new int[]{};
        }
        
       int[] freq = new int[100001];
        
        for(int a:arr){
            freq[a]++;
        }
        
        int index =0;
        
        for(int i = 0 ;i<freq.length;i++){
            
            while(freq[i] > 0 && i*2 < freq.length && freq[i*2] > 0){
                freq[i]--;
                freq[i*2]--;
                ans[index++]= i;
                
            }
        }
        
        
        for(int a:freq){
            if(a != 0){
                return new int[]{}; 
            }
        }
        
    
        
      return ans;  
    }
}