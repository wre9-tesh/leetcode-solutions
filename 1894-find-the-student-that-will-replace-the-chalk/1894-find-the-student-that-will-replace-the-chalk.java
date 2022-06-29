class Solution {
    public int chalkReplacer(int[] chalk, int k) {
    int sum=0;
        for (int i = 0; i < chalk.length; ++i) {
            sum += chalk[i];
            k -= chalk[i];
            if (k < 0) {
                return i;
            }
        }

        
        k %= sum;
        
        for(int j=0;j<chalk.length;++j){
           
            k -= chalk[j];
            if (k < 0) {
                return j;
            }
        }
        
        
        
       return 0; 
    }
}