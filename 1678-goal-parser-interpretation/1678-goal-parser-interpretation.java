class Solution {
    public String interpret(String s) {
        StringBuilder str= new StringBuilder(s.length());
        
        int i=0;
        
        while(i<s.length()){
            if(s.charAt(i) == 'G'){
                str.append("G");
            }
            else if (s.charAt(i)== '('){
                if(s.charAt(i+1) == ')' ){
                    str.append("o");
                    i++;
                }
                else{
                    str.append("al");
                    i+=3;
                }
            }
            i++;
        }
        
        return str.toString();
    }
}