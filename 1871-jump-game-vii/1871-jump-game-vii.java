class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        
        if(s.charAt(s.length()-1) == '1'){
                return false;
        }
        
        char[] arr = s.toCharArray();
    
        for(int i=0,j=0 ; i<s.length();++i){
           
            if(i == 0 || arr[i] == '2' ){
                
               for(j = Math.max(j,i+minJump);j <= Math.min(s.length()-1,i+maxJump);j++){
                   if(arr[j] == '0'){
                       arr[j] = '2';
                   }
                   
               } 
            

            }        
        }        
 return arr[arr.length-1] == '2';
}
}