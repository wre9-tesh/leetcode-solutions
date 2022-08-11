class Solution {
    public int[] decode(int[] encoded) {
        int[] ans = new int [encoded.length + 1];
        int n = encoded.length + 1;
        int x = 0;
        int e = 0;
        
        for(int i=1;i<=n;i++){
            
            x ^= i;
            
        }
        
        for(int j=1;j<encoded.length;j+=2){
            e ^= encoded[j] ;
       
        }
        
        ans[0] = e^x;
        
         for(int k=1;k<ans.length;k++){

            ans[k]=encoded[k-1]^ans[k-1];
        }
        return ans;
    }
}