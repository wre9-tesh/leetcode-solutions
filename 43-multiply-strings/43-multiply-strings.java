class Solution {
    public String multiply(String num1, String num2) {
  
        int n = num1.length();
        int m = num2.length();
        
       
      int[] prod = new int[n+m];
        
       for(int i=n-1;i>=0;--i){
           for(int j=m-1;j>=0;--j){
           
               prod[i+j+1] += (num1.charAt(i) -'0') * (num2.charAt(j)-'0');

           }
           
       } 
        int carry = 0 ;
        
        for(int j = prod.length - 1 ;j>=0;j--){
            
            int temp = (prod[j] + carry) % 10;
            
            carry = (prod[j] + carry) / 10 ;
            
            prod[j] =temp;
        }
          
         StringBuilder sb = new StringBuilder();
        
       for (int num : prod) sb.append(num);

 while (sb.length() != 0 && sb.charAt(0) == '0') sb.deleteCharAt(0);
        return sb.length() == 0 ? "0" : sb.toString();
        
  
    }
}