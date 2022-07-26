class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
     
        if(m == 0 || n == 0){
            if(m==0){
                nums1[0] = nums2[0];
            }
            else{
               return;
            }

        }
        
        
        
        
        int[] mix = new int[nums1.length];
        
        int i=0,j=0,k=0;
        
        while(i<m && j<n){
            
            if(nums1[i] < nums2[j]){
                mix[k] = nums1[i];
                i++;
            }
            else{
                mix[k] = nums2[j];
                j++;
            }
            k++;
        }
        
        while(j<n){
            mix[k] = nums2[j];
            k++;
            j++;
        }
        while(i<m){
            mix[k] = nums1[i];
            k++;
            i++;
        }
        
        for(int l=0;l<m+n;l++){
            
            nums1[l] = mix[l];
            
        }
        
        
    }
}