class Solution {
    public boolean halvesAreAlike(String s) {
        char[] a=s.toCharArray();
        int count_1=0,count_2=0;
        for(int i=0;i<a.length;i++){
            if(i < (a.length/2) ){
                if(a[i] == 'a'|| a[i] == 'e'||a[i] == 'i'||a[i] == 'o' || a[i] == 'u' 
                    || a[i] == 'A' || a[i] == 'E'|| a[i] == 'I' || a[i] == 'O' ||a[i] == 'U'){
                    count_1++;
                }
            }
            else{
                 if(a[i] == 'a'|| a[i] == 'e'||a[i] == 'i'||a[i] == 'o' || a[i] == 'u' 
                    || a[i] == 'A' || a[i] == 'E'|| a[i] == 'I' || a[i] == 'O' ||a[i] == 'U'){
                    count_2++;
                }
            }
            
        }
        return count_1 == count_2;   
    }
}