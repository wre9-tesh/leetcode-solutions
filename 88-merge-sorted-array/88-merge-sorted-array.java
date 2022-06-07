class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i = nums1.length - 1;
        int j = 0;
        
        
      
        
        while( i >= 0 && nums1[i] == 0 && j < nums2.length ){
                 swap(nums1,nums2,i,j); 
            i--;
            j++;
        }
        
     
        Arrays.sort(nums1);
        
        
        
    }
    public void swap(int[] n1 ,int[] n2 ,int a, int b){
            int temp=n1[a];
                n1[a]=n2[b];
                n2[b]=temp;
        
    }
}