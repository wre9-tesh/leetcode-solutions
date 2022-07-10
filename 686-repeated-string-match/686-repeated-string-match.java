class Solution {
    public int repeatedStringMatch(String a, String b) {
        
        int ans=0;
    
        StringBuilder str = new StringBuilder();
        
    while(str.length() < b.length()){
        
        str.append(a);
        ans++;

    }    
        
   if(str.toString().contains(b)) return ans;     
        
 if(str.append(a).toString().contains(b)) return ++ans; 
        
        
        
        
        return -1;
}
}