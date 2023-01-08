class Solution {
    public int maxPoints(int[][] points) {
        
        int n = points.length;
        
        if(points.length <= 2){
            return n;
        }
        
        int result = 2;
        
        for(int i = 0 ; i<n ; i++){
            Map<Double, Integer> map = new HashMap<>();
            for(int j = 0 ; j < n ; j++){
                if(j != i)
          map.merge(Math.atan2(points[j][1]-points[i][1],points[j][0]-points[i][0]),1,Integer::sum);
                                
            }
            result = Math.max(result,Collections.max(map.values())+1);
        }
        
    return result;
    }
}