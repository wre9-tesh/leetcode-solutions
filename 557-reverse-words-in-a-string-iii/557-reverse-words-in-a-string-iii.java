class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder str = new StringBuilder();
        
        for(String i:arr){
            str.append(new StringBuffer(i).reverse()+" ");
        }
        
        

    return str.toString().trim();        
    }    
}