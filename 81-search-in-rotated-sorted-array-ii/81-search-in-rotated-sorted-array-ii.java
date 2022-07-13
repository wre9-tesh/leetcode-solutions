class Solution {
    public boolean search(int[] nums, int target) {
        int pivot=pivot(nums);
        if(pivot == -1){
            return Bs(nums,target,0,nums.length -1);
        }
        if(nums[pivot] > target){
            if(Bs(nums,target,0,pivot -1) == false){
                return Bs(nums,target,pivot + 1,nums.length -1); 
            }
            return true;
        }
        if(nums[pivot] == target){
            return true;
        }
        
       return false; 
    }
         public int pivot(int[] A) {
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
              if (A[mid] == A[start] && A[mid] == A[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (A[start] > A[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (A[end] < A[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(A[start] < A[mid] || (A[start] == A[mid] && A[mid] > A[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public boolean Bs(int[] arr,int target,int start,int end){
            while(start <= end){
                int mid= start+(end-start)/2;
                if(arr[mid] > target){
                    end= mid - 1;
                }
                else if(arr[mid] < target){
                    start=mid + 1;
                  }
                else{
                    return true;
                }   
            }
        return false;
    }
}