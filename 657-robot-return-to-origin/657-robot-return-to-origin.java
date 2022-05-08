class Solution {
    public boolean judgeCircle(String s) {
        int x=0,y=0;
        char[] move=s.toCharArray();
        for(int i=0;i<move.length;i++) {
            switch (move[i]) {
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
            }
        }
        return x==0 && y==0;
    }
}