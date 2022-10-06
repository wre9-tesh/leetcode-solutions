class Solution {
    public int sumOfUnique(int[] nums) {
        int[] freq = new int[101];
        
        for(int n:nums){
                freq[n]++;
        }
        
        
        int sum = 0;
        
        
        for(int i=0;i<freq.length;i++){
            if(freq[i] == 1){
                sum += i;
            }
        }
        
        
        
 return sum;       
    }
}