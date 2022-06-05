class Solution {
    public int maxArea(int[] height) {
       int area=0;
        int start=0;
        int end=height.length - 1;
        int width=0;
        int length=0;
        while(start < end){
         
             width = Math.min(height[start],height[end]);
            length= end - start ;
            area = Math.max(area,(length*width));
            
            if(height[start] > height[end] ){
                end--;
            }
             
            else if(height[start] < height[end] ){
                start++;
            }
            else{
                start++;
                end--;
            }
        }
      return area;  
    }
}