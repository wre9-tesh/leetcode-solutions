class Solution {
    public List<Integer> grayCode(int n) {
        
        if(n == 1){
            List<Integer> ans_1 = new ArrayList<>();
            
            ans_1.add(0);
            ans_1.add(1);
        
            return ans_1;
        }
        
       List<Integer> tmp = grayCode(n-1);
    List<Integer> ans = new ArrayList<Integer>(tmp);
                
        int addNum = 1 << (n-1);
        
        for(int i = tmp.size()-1;i>=0;i--){
            
            ans.add(addNum+tmp.get(i));
        }
        
        

        
       return ans;
    }
}