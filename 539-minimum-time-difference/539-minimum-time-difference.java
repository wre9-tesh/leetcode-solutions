class Solution {
    public int findMinDifference(List<String> time) {
        
        int[] arr =new int[time.size()];
        
        for(int i=0;i<arr.length;i++){
       String[] t = time.get(i).split(":");
            
            int h = Integer.parseInt(t[0]);
            int m = Integer.parseInt(t[1]);
            
        
            arr[i] = (h *60) + m;
        }
                
        Arrays.sort(arr);
        
        int res = 1440 + arr[0] - arr[arr.length-1];
        
        
          for(int i=1;i<arr.length;i++){
        
              res = Math.min(res,arr[i] - arr[i-1]);
          }  

        
        return res;
    }
}