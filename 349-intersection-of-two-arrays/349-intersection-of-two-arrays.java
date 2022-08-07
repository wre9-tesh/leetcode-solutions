class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
          

         Set<Integer> ans = new HashSet<>();
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
            
        int i=0,j=0,k=0;
        
        
        while(i <nums1.length && j<nums2.length){
            
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            
            else{
                ans.add(nums1[i]);
                i++;
                j++;
            }
        }
        
        int[] arr = new int[ans.size()];
        
        
        
     for(Integer num : ans){
            arr[k++] = num ;
         
         
     }
        
      return arr;  
    }
    
}