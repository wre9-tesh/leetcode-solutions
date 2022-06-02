class Solution {
    public String reversePrefix(String word, char ch) {
      char[] c = word.toCharArray();
        
        int locate = word.indexOf(ch);
                if(locate == -1){
                    return word;
                }        
        
        int i=0;
        
        while(i < locate){
            
            swap(c,i,locate);
            i++;
            locate--;
            
        }
        
        
        return String.copyValueOf(c);
    }
    void swap(char[] arr , int start ,int end){
        char temp =arr[start];
        arr[start]= arr[end];
        arr[end]=temp;
    }
}