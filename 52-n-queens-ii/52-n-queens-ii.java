class Solution {
    public int totalNQueens(int n) {
        
        boolean[][] board = new boolean[n][n]; 
        
        return numberOfSol(board,0);
    }
    
    
    public int numberOfSol(boolean[][] arr,int row){
        
        if(row == arr.length){
            return 1;
        }
        
        int count =0;
        
        for(int col=0;col<arr.length;col++){
    
               if(isSafe(arr,row,col)){
                   
                   arr[row][col] = true; 
                   
                 count += numberOfSol(arr,row+1);
                    
                   arr[row][col] = false;
                }
        }
                   
            return count;
    }
    
    public boolean isSafe(boolean[][] arr,int row,int col){
//         vertical 
        for(int i = 1;i<=row;++i){
               if(arr[row - i][col]){
                   return false;
               } 
        }
        
//         diagonal left
        int maxLeft = Math.min(row,col);
        
        for(int i = 1; i <= maxLeft ;i++){
            
            if(arr[row-i][col-i]){
                return false;
            }
            
        }
        
          int maxRight =  Math.min(row,arr.length - 1 - col);
        
        for(int i = 1; i <= maxRight ;i++){
            
            if(arr[row-i][col+i]){
                return false;
            }
            
        }
        
   
        return true;
    }

}