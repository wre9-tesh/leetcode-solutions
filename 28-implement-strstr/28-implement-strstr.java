class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            
            for(int i=0; i<haystack.length();i++){
                
                if(needle.charAt(0) == haystack.charAt(i) ){
                    if(isSame(haystack,needle,i)) {
                        return i;
                    }
                    else{
                        continue;
                    }
                       
                }      
            
            }         
        }
           
   
        return -1;
    }
    boolean isSame(String hay,String needle,int j){
		    for(int i=0;i<needle.length();i++){
                   if( j < hay.length() && hay.charAt(j) != needle.charAt(i)){
                       return false;
                   }
                j++;
            }
        return true;
	}

}