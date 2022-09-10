class Solution {
    public int heightChecker(int[] heights) {

        int[] ans = Arrays.copyOf(heights,heights.length);
 
            Arrays.sort(ans);
        
        int count =0;
        int i=0;
        for(int n: heights){
            
            if(n!= ans[i]){
                count++;
            }
            
            i++;
            
        }
        
        return count;
    }
}