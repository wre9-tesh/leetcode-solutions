class Solution {
    public int search(int[] nums, int target) {
        int peak = peak(nums);
        int ans=0;
        if(peak == -1){
           return ans=Bs(nums,target,0,nums.length -1);
        }
        
         if(nums[peak] == target){
        return peak;
        }
        if(nums[0] <= target){
            ans=Bs(nums,target,0,peak -1);
        }
        else{
            ans=Bs(nums,target,peak+1,nums.length - 1);
        }
        
       return ans;
    }
     public int peak(int[] A) {
        int start=0;
        int end=A.length-1 ;
        
        while(start < end){
        int mid=start +(end-start)/2;
                if(mid < end && A[mid] > A[mid + 1]){
                    return mid;
                }
                if(mid >start && A[mid] < A[mid -1]){
                    return mid-1;
                }
                if(A[start] >= A[mid]){
                    end =mid -1;
                }
                else{
                    start = mid +1;
                }
            }
        return -1;
            }
    public int Bs(int[] arr,int target,int start,int end){
            while(start <= end){
                int mid= start+(end-start)/2;
                if(arr[mid] > target){
                    end= mid - 1;
                }
                else if(arr[mid] < target){
                    start=mid + 1;
                  }
                else{
                    return mid;
                }   
            }
        return -1;
    }

}