class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        
        
        int start=0;
        int end=position[position.length-1];
        int ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(canplace(position,m,mid)){
                ans=mid;
                start=mid+1;
            }
            else{
            end=mid-1;}
        }
 return ans;
    }
    public boolean canplace(int[] nums,int m ,int mid){
        int curr=nums[0];
            int count=1;
        for(int i =0;i<nums.length;i++){
            if(nums[i]-curr >= mid){
                curr=nums[i];
                count++;
            }
        }
        
        return  count >= m;
    }
}