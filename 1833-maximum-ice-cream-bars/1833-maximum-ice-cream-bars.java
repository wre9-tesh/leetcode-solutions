class Solution {
    public int maxIceCream(int[] costs, int coins) {
        
        Arrays.sort(costs);
        
        int i=0;
        
        while(coins >= costs[i] && i < costs.length){
            
             coins -= costs[i];
            i++;
            
            if(i >= costs.length){
                return costs.length;
            }
            
            
        }
        
        return i;
    }
}