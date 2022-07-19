class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans =new ArrayList<List<Integer>>();
        
        
        ArrayList<Integer> str = new ArrayList<>();
        
        
        for(int i=0; i< numRows ; i++){
            
            
            for(int j= str.size()-1;j>=1;--j){
                
                str.set(j,str.get(j) + str.get(j-1));
                            
            }
            str.add(1);
            ans.add(new ArrayList(str));
            
            
        }
        
        
        return ans;
    }
}