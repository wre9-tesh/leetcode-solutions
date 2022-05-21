class Solution {
    public String freqAlphabets(String s) {
        StringBuilder str = new StringBuilder();
     
        for(int i= s.length()-1;i>=0 ; i--){
            
            if(s.charAt(i)=='#'){
                
                str.append((char)('a' - 1 + (s.charAt(i-1)- '0') + 10*(s.charAt(i-2)- '0')));
                i-=2;
                
            }
            else{
            
                str.append((char)('a' - 1 + (s.charAt(i) - '0')));
            }
    
        }
        
        
        
      return str.reverse().toString();
    }
}