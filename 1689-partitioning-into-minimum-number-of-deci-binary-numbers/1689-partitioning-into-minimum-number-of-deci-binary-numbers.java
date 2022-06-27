class Solution {
    public int minPartitions(String n) {
        int ans = 0;
        for(int i=0;i<n.length() ;i++){
            
            ans = Math.max(ans,Integer.parseInt(String.valueOf(n.charAt(i))));
        }
        
        return ans;
    }
}