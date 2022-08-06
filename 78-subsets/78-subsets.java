class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        ans.add( new ArrayList<>());
        
        
        for(int n:nums){
            int m = ans.size();
            for(int i=0;i<m;i++){
                List<Integer> internal = new ArrayList<>(ans.get(i));
                
                internal.add(n);
                ans.add(internal);
            }       
        }
        
            
        
        return ans;
    }
}