class Solution {
    public boolean reorderedPowerOf2(int n) {
        
       char[] arr = String.valueOf(n).toCharArray();
            Arrays.sort(arr);
        
        for(int i=0;i<30;i++){
            
              char[] pow = String.valueOf(1 << i).toCharArray();
            
            Arrays.sort(pow);
                
            if(Arrays.equals(pow,arr)) return true;
            
            
        }
        
        
      return false;  
    }
}