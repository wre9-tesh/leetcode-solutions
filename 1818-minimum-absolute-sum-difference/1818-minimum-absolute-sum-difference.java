class Solution {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
     
        int[] sorted = nums1.clone();
        
        Arrays.sort(sorted);
        
        
        int result =0;
        int save =0;
        
        for(int i=0;i<nums1.length;i++){
            result += Math.abs(nums1[i] - nums2[i]);
            result %= (1e9 + 7);    
        }
        
        
        for(int i=0;i<nums1.length;i++){
            if (nums1[i] == nums2[i] ){
                continue;
            }
            
            int index = Arrays.binarySearch(sorted,nums2[i]);
            int diff = Math.abs(nums1[i] - nums2[i]);
        
            
            if(index >= 0){
                save =Math.max(save,diff);        
            }
            else{
                int actualIndex = -1 *(index + 1);
                if(actualIndex > 0){
                    save = Math.max(save,diff- Math.abs(nums2[i]-sorted[actualIndex-1]));
                }
                if(actualIndex < nums1.length){
                    save =  Math.max(save, diff - Math.abs(nums2[i] - sorted[actualIndex]));
                }
                
                
            }
            
            
        }
        
    
        return (1000000007+result - save) % 1000000007;
    }
}