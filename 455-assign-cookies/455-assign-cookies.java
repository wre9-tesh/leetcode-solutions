class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);
        
        int count =0;
        int child=0,candy=0;
       while(child < g.length && candy < s.length){
           
           if(s[candy] >= g[child]){
               count++;
               candy++;
               child++;
               
           }
           else{
        candy++;
           }
       } 
        
        
      return count;  
    }
}