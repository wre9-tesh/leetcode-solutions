class Solution {
    public int[][] transpose(int[][] a) {
       int m = a.length; int n = a[0].length;
         
        int[][] ans =new int[n][m];
        
        for(int i=0;i < n ; i++){
            for(int j=0;j < m ; j++){
                ans[i][j]=a[j][i];
            }
        }
        
        return ans;
        
    }
}