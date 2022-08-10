class Solution {
    public List<String> letterCombinations(String digits) {
         
        if(digits.length() == 0){
            return new ArrayList<String>();
        }
        
       return helper("",digits);

    }
    public List<String> helper(String p,String up){
        
        if(up.isEmpty()){
            List<String> ans =  new ArrayList<>();
            ans.add(p);
            return ans;            
        }
        
        int digit = up.charAt(0) - '0';
        
        List<String> internal =  new ArrayList<>();
        
        if(digit < 7){
        for(int i = (digit-2)*3;i<(digit-1)*3;i++){
            char ch = (char)('a' + i);                
            internal.addAll(helper(p+ch,up.substring(1)));  
        }
        }
        else if (digit == 7){
            for(int i = (digit-2)*3;i<=(digit-1)*3;i++){
            char ch = (char)('a' + i);                
            internal.addAll(helper(p+ch,up.substring(1)));  
        }
        }
        else if(digit == 8){
         for(int i = ((digit-2)*3)+1 ;i<=(digit-1)*3;i++){
            char ch = (char)('a' + i);                
            internal.addAll(helper(p+ch,up.substring(1))); 
        }
        }
        else{
             for(int i = ((digit-2)*3)+1 ;i<=((digit-1)*3)+1;i++){
            char ch = (char)('a' + i);                
            internal.addAll(helper(p+ch,up.substring(1))); 
        } 
        }
    
        return internal;
    }
}