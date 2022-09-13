class Solution {
    public double average(int[] salary) {
        

        int max = -1,min=-1,max_val = Integer.MIN_VALUE,min_val = Integer.MAX_VALUE;
        
        double sum =0;
        
        for(int i=0;i<salary.length;i++){
            
            if(salary[i] > max_val){
                max_val = salary[i];
                max = i;
            }
            
            if(salary[i] < min_val){
                min_val = salary[i];
                min = i; 
            }
            
             
            sum += salary[i];
        }
        
       
        sum = (sum-min_val-max_val)/(salary.length -2);
                
        return sum;
    }
}