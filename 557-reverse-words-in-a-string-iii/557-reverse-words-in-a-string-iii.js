/**
 * @param {string} s
 * @return {string}
 */
const reverseWords = function(s) {
    let ans = s.split(" ");
   
    for(let i=0;i<ans.length;i++){
        
        let arr = ans[i].split("");
        
        arr.reverse();
        let joint = arr.join("");
        arr.pop();
        ans[i] = joint;

        
    }
    
    return ans.join(" ");
};