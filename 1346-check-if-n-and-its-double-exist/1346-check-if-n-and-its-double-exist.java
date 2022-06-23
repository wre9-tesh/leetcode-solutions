class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length - 1 ;i++){
            int start=i+1;
            int end = arr.length-1;
            if(arr[i] >= 0 ){
            while(start<=end){
                int mid=start+(end-start)/2;
                
                if(arr[i] * 2 ==  arr[mid]){
                    return true;
                }
                else if (arr[i] * 2 <  arr[mid]){
                    end=mid - 1;
                }
                else{
                    start=mid+1;
                }
            }
        }
            if(arr[i] % 2 == 0 && arr[i] < 0){
                while(start<=end){
                int mid=start+(end-start)/2;
                
                if(arr[i] / 2 ==  arr[mid]){
                    return true;
                }
                else if (arr[i] /2 <  arr[mid]){
                    end=mid - 1;
                }
                else{
                    start=mid+1;
                }
                
            }
        }
     
    }
           return false;
}
}