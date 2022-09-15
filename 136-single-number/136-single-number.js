/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
    
    let ans = 0;
    
    for(let n of nums){
        
        ans ^= n;
        
    }
    
    return ans;
};