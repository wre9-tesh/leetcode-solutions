class Solution {
    public int romanToInt(String s) {
        int value=0;
        
        for(int i=0;i<s.length();i++){
                if(i<s.length()-1 && intValueOfRoman(s.charAt(i)) < intValueOfRoman(s.charAt(i+1))){
                    value-=intValueOfRoman(s.charAt(i));
                }
            else{
                value+=intValueOfRoman(s.charAt(i));   
            }
            }
        return value;
    }
    public int intValueOfRoman(char c){
            
            switch(c){
                case 'I' : return 1;
                case 'V' : return 5;
                case 'X' : return 10;
                case 'L' : return 50;
                case 'C' : return 100;
                case 'D' : return 500;
                case 'M' : return 1000;
                default  : return 0;
            }
        }
}