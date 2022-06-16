class Solution {
    public int findTheDistanceValue(int[] A, int[] B, int d){
        int ans=0;
        Arrays.sort(B);
        
        for(int a=0;a<A.length;a++){
            int a1=A[a];
            boolean worth=true;
            
            int start=0;
            int end=B.length-1;
            
            while(start <= end){
                
                int mid =start+(end-start)/2;
                int b1=B[mid];
                if(Math.abs(a1-b1) <= d){
                    worth=false;
                    break;
                }
                else if(a1 < b1){
                    end = mid -1;
                }
                else{
                    start=mid+1;
                }
            }
            
            if(worth){
                ans++;
            }
            
        }
       
    return ans;    
        
    }
}