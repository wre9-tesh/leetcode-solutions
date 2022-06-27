class Solution {
    public int minPartitions(String n) {
        int ans = 0;
       for(int i = 9; i > 0; i--){
if(n.contains(""+i)) return i;
}
return -1;
    }
}