class Solution {
    public int bagOfTokensScore(int[] token, int power) {
        
        Arrays.sort(token);
        
        int score = 0,ans = 0;
        
        int lo = 0,hi=token.length-1;
        
        while(lo<=hi){
            
            if(power >= token[lo]){
                score++;
                ans = Math.max(ans,score);
                power -= token[lo];
                lo++;
            }
            
            else if(score >=1 && power < token[lo]){
                score--;
                power += token[hi];
                hi--;
            }
            
            else{
                break;
            }
        }
        
            
         return  ans;   
    
}
}