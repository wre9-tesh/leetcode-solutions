class Solution {
    public int totalNQueens(int n) {
    
        boolean[][] arr = new boolean[n][n];
        
        return Queens(arr,0);
        
        
    }
    
    public int Queens(boolean[][] arr,int row){
        
      if(row == arr.length){
          return 1;
      } 
        
        int count =0;
        
      for(int col=0;col<arr.length;col++){
          
        if(isSafe(arr,row,col)){
                
            arr[row][col] = true;
            count += Queens(arr,row+1);
            arr[row][col] = false;
            
        }       
      }
        
        return count;
    }
    
    public boolean isSafe(boolean[][] arr,int row,int col){
        
        
        for(int i = 0 ; i < row ; i++ ){
                if(arr[i][col]){
                    return false;
                }            

        }
//         for diagonal left
        for(int i = 1 ; i <= Math.min(row,col);i++){
            if(arr[row-i][col-i]){
                return false;
            }
        }
        
//      for diagonal right   
        for(int i = 1 ; i <= Math.min(row,arr.length-col-1);i++){
            if(arr[row-i][col+i]){
                return false;
            }
        }
        
        return true;
    }    
}