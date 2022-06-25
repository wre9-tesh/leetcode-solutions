class Solution {
    public int findMin(int[] nums) {

        int min_index = peak(nums);
        
        if(min_index == -1){
            return nums[0];
        }

        return nums[min_index+1];        
        
        
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
}