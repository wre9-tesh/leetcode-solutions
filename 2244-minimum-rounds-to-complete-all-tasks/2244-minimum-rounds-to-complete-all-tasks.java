class Solution {
    public int minimumRounds(int[] tasks) {
        
        HashMap<Integer,Integer> freq = new HashMap<>();
        
        for(int i:tasks){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        
        int minRound = 0;
        
        for(int count:freq.values()){
            
            if (count == 1){
                return -1;
            }
            
            if(count % 3 == 0){
                minRound += count / 3;
            }
            else{

             minRound += count / 3 + 1;   
                
            }
            
        }

        


        return minRound;
    }
}