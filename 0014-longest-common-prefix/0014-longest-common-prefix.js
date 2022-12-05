/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    
    var indexs=strs[0].length;
    
    var sol=strs[0];
strs.map(str=>{
        var i=0;
        while(i<indexs&&i<str.length){
            if(str.charAt(i)===sol.charAt(i)){
                i++;
            }
            else break;
        }
        indexs=i;
    });

  return sol.slice(0,indexs);  
};