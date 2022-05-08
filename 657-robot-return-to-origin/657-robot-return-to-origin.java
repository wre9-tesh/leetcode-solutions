class Solution {
    public boolean judgeCircle(String s) {
        int[] arr={0,0};
        int[] ans={0,0};
        
        char[] move=s.toCharArray();
        for(int i=0;i<move.length;i++) {
            switch (move[i]) {
                case 'R':
                    arr[0]++;
                    break;
                case 'L':
                    arr[0]--;
                    break;
                case 'U':
                    arr[1]++;
                    break;
                case 'D':
                    arr[1]--;
                    break;
            }
        }
        if(arr[0]== 0 && arr[1]== 0){
    return true;
        }
           
        
    return false;    
    }
}