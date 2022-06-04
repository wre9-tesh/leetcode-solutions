class Solution {
    public boolean isPalindrome(int x) {
           int a=x,rev=0,digit;
       if(x<0){
           return false;
       }
       else{ 
        while(x!=0){  
     digit=x%10;
            
        rev=rev*10+digit;
            x=x/10;
        }
        
        if(rev==a){
            return true;
        }
        else
            return false;
    }
    }
}