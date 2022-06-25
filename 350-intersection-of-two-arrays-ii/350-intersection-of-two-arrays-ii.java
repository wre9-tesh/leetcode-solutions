class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
    
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0,j =0;
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        while(i < nums1.length && j<nums2.length ){
           
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
     
	int[] g = new int[ans.size()];
	for (int k = 0; k < ans.size(); k++) {
		g[k] = ans.get(k);
	}
	return g;
    }
}