class Solution {
    public int maxArea(int h, int w, int[] hCuts, int[] vCuts) {
        
        int length = maximize(hCuts,h);
        int breadth = maximize(vCuts,w);
    
        return (int)((long)length * breadth % 1000000007);
    }
    
    public int maximize(int[] arr,int end){

        Arrays.sort(arr);
        
        int start =0;
        int gap =0;
        int i=0;
        while(i <= arr.length && start < end  ){
                
            if(i == arr.length){
             gap = Math.max(gap,end-start);   
            }
            else{
            gap = Math.max(gap,arr[i]- start);  
                start =arr[i];
            }
            i++;
            
            }        

        return gap;
    }
}