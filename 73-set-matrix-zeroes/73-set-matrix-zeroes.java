class Solution {
    public void setZeroes(int[][] matrix) {
        
        List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();
         
        for(int i = 0; i < matrix.length;i++){
            for(int j=0;j < matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        
        for(int i =0;i<row.size();i++){
            helper(matrix,row.get(i),col.get(i));
        }
        
        
        
        
        
    }
    
    public void helper(int[][] arr,int row,int col){
        
       for(int i = row ;i >= 0 ; --i){
           arr[i][col] = 0;
       } 
        
       for(int i = row ; i < arr.length;i++){
           arr[i][col] = 0;
       } 
        
        for(int i = col ; i >= 0; --i){
           arr[row][i] = 0;
       } 
        
        for(int i = col ; i < arr[0].length;i++){
           arr[row][i] = 0;
       }  
            
        
        
    }
}