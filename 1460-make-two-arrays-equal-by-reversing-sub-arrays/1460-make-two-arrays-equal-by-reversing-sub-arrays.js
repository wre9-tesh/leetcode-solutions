
var canBeEqual = function(target, arr) {
    
    return target.sort().join('') === arr.sort().join('');
   
};