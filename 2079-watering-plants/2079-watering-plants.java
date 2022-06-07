class Solution {
   public int wateringPlants(int[] p, int capacity) {
        int temp =capacity;
        int steps =0;
       for(int i=0 ; i< p.length ;++i){
            
           if(p[i] > temp ){
               steps += i*2;
               temp =capacity;
           }
           temp -= p[i];
           ++steps;
       }
       
       
    return steps;   
}
}