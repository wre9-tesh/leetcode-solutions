class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        
        int[] ans = new int[1001];
        
        for(int i=0;i<target.length;i++){
            
            ans[target[i]]++;
            ans[arr[i]]--;

            
        }
        for(int i=0;i<1000;i++){
            if(ans[i] != 0){
                return false;
            }
        }
        
        return true;
    }
}