class Solution {
    public List<List<String>> solveNQueens(int n) {
       boolean[][] arr = new boolean[n][n];
        
       List<List<String>> ans = new ArrayList<>();
        
        Queens(arr,0,ans);
    
    return ans;
    }
    
    public static void Queens(boolean[][] arr,int row,List<List<String>> outer){

        if(row == arr.length){
            outer.add(ansList(arr));
            return ;
        }


        for(int col=0;col<arr.length;col++){

            if(isSafe(arr,row,col)){

                arr[row][col] = true;
                 Queens(arr,row+1,outer);
                arr[row][col] = false;


            }
        }
    }

    public static boolean isSafe(boolean[][] arr,int row,int col){
        for(int i = 0 ; i < row ; i++ ){
            if(arr[i][col]){
                return false;
            }
        }

        for(int i = 1 ; i <= Math.min(row,col);i++){
            if(arr[row-i][col-i]){
                return false;
            }
        }
        for(int i = 1 ; i <= Math.min(row,arr.length-col-1);i++){
            if(arr[row-i][col+i]){
                return false;
            }
        }
        return true;
    }

    public static  List<String> ansList(boolean[][] arr){
       List<String> ans = new ArrayList<>();

       for(boolean[] a:arr){
           StringBuilder str = new StringBuilder();
           for (int i = 0; i < arr.length; i++) {
               if(a[i]){
                   str.append('Q');
               }
               else {
                   str.append('.');
               }
           }
           ans.add(str.toString());
       }

       return ans;
    }
}
