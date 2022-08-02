class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int len = matrix.length*matrix.length;
        int[] arr = new int[len];
        
        
        int l=0,j=0;
        for(int i=0;i<len;i++){
            
            if(j >= matrix[0].length ){
                l++;
                j=0;
            }
            
            arr[i] = matrix[l][j];
            
            j++;
        }
        
        Arrays.sort(arr);
        
        
        return arr[k-1];
    }
}