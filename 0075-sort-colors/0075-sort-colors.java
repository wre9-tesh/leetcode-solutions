class Solution {
    public void sortColors(int[] nums) {
    
        Map <Integer,Integer> map = new HashMap<>();
        
                     
        int ze = 0;
        int on = 0;
        int tw = 0;
        
        for(int num : nums){
            
            map.put(num, map.getOrDefault(num,0)+1);
            
         ze = map.getOrDefault(0,0);
         on = map.getOrDefault(1,0);
         tw = map.getOrDefault(2,0);
        }
       
        int i=0;    
        while(ze > 0){
           nums[i] = 0;
            i++;
            ze--;
        }
        
        while(on > 0){
           nums[i] = 1;
            i++;
            on--;
        }
            
        while(tw > 0){
           nums[i] = 2;
            i++;
            tw--;
        } 
        
        
        
        
        
    }
}