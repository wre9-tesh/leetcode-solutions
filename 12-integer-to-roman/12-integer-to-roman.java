class Solution {
    public String intToRoman(int N) {
        
        int[] arr = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        
        String[] str = {"M", "CM", "D", "CD", "C" , "XC","L" ,"XL", "X","IX" , "V" , "IV" , "I"};
        
        StringBuilder ans = new StringBuilder();

        
        
        for(int i=0; N > 0;i++){
            
            while(N >= arr[i]){
                ans.append(str[i]);
                N-=arr[i];
            }

        }
        
        
        return ans.toString();
        
    }
}