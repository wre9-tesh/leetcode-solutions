/**
 * @param {string[]} sentences
 * @return {number}
 */
var mostWordsFound = function(sentences) {
    
    let max =0;
    
    for(let i=0;i<sentences.length;i++){
        
        let ans = sentences[i].split(' ');
        
        max = Math.max(ans.length,max);
    }
    
    return max;
};