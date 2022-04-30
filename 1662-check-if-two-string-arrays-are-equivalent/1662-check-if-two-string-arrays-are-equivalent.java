class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str_1=new StringBuilder();
        StringBuilder str_2=new StringBuilder();
        
        for(String i:word1){
           str_1.append(i);
        }
         for(String j:word2){
            str_2.append(j);
        }
     
        return str_1.toString().equals(str_2.toString());
        
    }
}