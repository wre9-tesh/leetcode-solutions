class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length; 
        int[] res = new int[n];
           
        
        for(int i=1 ; i<n;i++){
            
            if(ratings[i] > ratings[i-1]){
                res[i] = res[i-1] + 1;
            }   
        }
        
        for(int j=n-1;j>0;j--){
              if(ratings[j-1] > ratings[j] ){
                  res[j-1] = Math.max(res[j]+1,res[j-1]);
              }  
        }
        
        int sum=0;
        
        for(int i:res){
            sum+=i;
        }
        
        return sum+n;
    }
}