class Solution {
    public double angleClock(int hour, int min) {
        
        double hour_deg = (hour%12)*30 + (((double)min/60)*30);
        
         
        
        double min_deg = min * 6 ;
        
        
        double ans = Math.abs(hour_deg - min_deg);
        
        if(ans > 180){
            ans = 360.0 - ans;
        }
        
    return ans;      
    }
}