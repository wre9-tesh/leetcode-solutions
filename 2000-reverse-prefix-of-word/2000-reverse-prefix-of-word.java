class Solution {
    public String reversePrefix(String word, char ch) {
      char[] c = word.toCharArray();
        
        int locate = word.indexOf(ch);
        if(locate > -1){
        
         char[] res = new char[word.length()];
        for (int i = 0; i <= locate; i++) {
            res[i] = c[locate - i];
        }
        for (int i = locate + 1; i < word.length(); i++) {
            res[i] = c[i];
        }
        return String.valueOf(res);
        }
        
        
        return word;
    }
}