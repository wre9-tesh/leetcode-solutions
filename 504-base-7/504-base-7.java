class Solution {
    public String convertToBase7(int num) {
        int sum=0,base=1;
       
        while(num!=0){
            sum+= (num%7)*base;
            num/=7;
            base*=10;
        }
        
        
        
       return String.valueOf(sum); 
    }
}