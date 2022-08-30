class Solution {
    public void rotate(int[][] array) {
    
        
    Collections.reverse(Arrays.asList(array));
        
        
       for (int i = 0; i < array.length; ++i) {
        for (int j = i + 1; j < array.length; ++j)
            swap(array,i,j);
       }
        
    
    } 
    
    public void swap(int[][] ans , int i ,int j){
            
        
        int temp = ans[i][j];
        ans[i][j] = ans[j][i];
        
        ans[j][i] =temp;
        
        
    }
    
    
}