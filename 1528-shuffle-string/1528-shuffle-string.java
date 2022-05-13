class Solution {
    public String restoreString(String s, int[] indices) {
        int i = 0;
        char[] ans = s.toCharArray();
        
        while(i < indices.length){
            ans[indices[i]] = s.charAt(i); 
            i++;
        }
        return new String(ans);
    }
}