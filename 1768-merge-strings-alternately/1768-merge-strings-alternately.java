class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
           int limit =0 ; 
        int i;
        if(word1.length() > word2.length()){
        
           limit = word2.length();
            
            }
        else{
            limit = word1.length();
        }
        
        for(i=0;i<limit ;i++){
            
            str.append(word1.charAt(i));
            
            str.append(word2.charAt(i));
            
        }
        
        if(word1.length() > word2.length()){
        
                str.append(word1.substring(i,word1.length()));
            
            }
        else{
             str.append(word2.substring(i,word2.length()));
        }
        
        
        
        
        
        return str.toString();
    }
}