class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
       Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        
        int boxes = 0;
        
        for(int[] nums: boxTypes){

            if(truckSize >= nums[0]){
                boxes += nums[0] * nums[1];
                
                truckSize -= nums[0];
                
            }
            else{
                boxes += truckSize * nums[1];
                return boxes;
            }
            
            
        }
            
        return boxes;
    }
}