class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] soldiers= new int [mat.length];
        int[] answer = new int[k];
        int col = mat[0].length;
        for(int i=0;i<mat.length;i++){
            int start=0;
            int end=mat[0].length-1;
            
            while(start<=end){
            int mid=start+(end-start)/2;
                    
                if(mat[i][mid] == 0){
                    end=mid - 1;
                }
                else if(mat[i][mid] == 1){
                    start=mid+1;
                }
            }
            soldiers[i]=end+1;
        }
   for (int x = 0; x < k; x++) {
			int index = 0;
			int min = col + 1;
			for (int y = 0; y < soldiers.length; y++) {
				if (soldiers[y] < min) {
					min = soldiers[y];
					index = y;
				}
			}
			soldiers[index] = col + 1; // this is to make sure that this index is not touched again
			answer[x] = index;
		}
		return answer;
}
}