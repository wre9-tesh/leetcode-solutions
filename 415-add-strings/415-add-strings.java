class Solution {
    public String addStrings(String num1, String num2) {
        
        StringBuilder str = new StringBuilder();
        
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        
       char[] n1 = num1.toCharArray();
       char[] n2 = num2.toCharArray(); 
        
       int carry =0;
         
        while( i >= 0 || j>= 0 || carry == 1){
         
           int a = (i >= 0) ? (n1[i--] -'0'):0;  
           int b = (j >= 0) ? (n2[j--] -'0'):0;  
    
         int sum = a + b + carry;   
            
            str.append(sum % 10);
            carry = sum/10;
              
            
        }
        
       return str.reverse().toString(); 
    }
}