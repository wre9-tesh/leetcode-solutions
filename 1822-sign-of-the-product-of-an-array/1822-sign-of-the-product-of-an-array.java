class Solution {
    public int arraySign(int[] nums) {
        int ans = 1;
        int prod =0;
        
        for(int i:nums){
       ans*=i;         
            if(ans == 0){
                break;
            }
            else if (ans < 0){
               ans = -1 ; 
            }
            else{
                ans =1;
            }
    }
    
        return ans;
}
}