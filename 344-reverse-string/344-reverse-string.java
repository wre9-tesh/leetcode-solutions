class Solution {
    public void reverseString(char[] s) {
        
        
        reverse(s,0,s.length-1);
        
    }
    public void reverse(char[] s,int i,int j){
        
        if(i > j){
            return;
        }
        
        swap(s,i,j);
        
        
        reverse(s,++i,--j);
        
    }
    public void swap(char[] s ,int a ,int b){
        char temp=s[a];
        s[a]=s[b];
        s[b]=temp;
    }
}