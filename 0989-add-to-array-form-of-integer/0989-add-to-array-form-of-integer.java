class Solution {
    public List<Integer> addToArrayForm(int[] nums, int k) {
        
        int i = nums.length;
        
        List<Integer> ans = new ArrayList<>();
       
        while(--i >= 0 || k !=0){
            
            if(i >= 0){
                k += nums[i];
            }
            
            ans.add(k%10);
            
            k /= 10;
            
            
        }
        
        
        
        Collections.reverse(ans);
        
        
        return ans;
    }
}