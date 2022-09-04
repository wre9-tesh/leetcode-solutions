class Solution {
    public int oddCells(int m, int n, int[][] indices) {
     
        int count = 0;
        
        int[][] arr = new int[m][n];
        
      for(int j=0;j<2;j++){  
        for(int i = 0;i < indices.length ;i++){
            
                if(j == 0){
              inc_val(arr,indices[i][j],m,n,true);  
                    }
                else{
                     inc_val(arr,indices[i][j],m,n,false);  
                }
            
            
            
        }
      }
        
     for(int row=0;row<m;row++){
         for(int col=0;col<n;col++){
             
             if(arr[row][col] % 2 != 0){
                 count++;
             }
             
         }
     }
        
  
      return count;  
    }
    
    
    public void inc_val(int[][] arr , int index ,int m , int n , boolean row ){
        
        if(row){
        
     for(int i =0; i < n  ;i++){
         
         arr[index][i]++;
     }
        }
        
        else{
            
             for(int i =0; i < m ;i++){
         
         arr[i][index]++;
         
     }
        }
        
    }    
}