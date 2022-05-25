class Solution {
    public String convertToTitle(int n) {
        StringBuilder str =new StringBuilder();
        
        while(n > 0 ){
            
            int a = n % 26 ;
            
            if( a == 0){
                a = 26;
                n--;
                
            }
            
             str.append((char)(a + 64));
                n/=26;
        }
        
        
        return str.reverse().toString();
    }
}