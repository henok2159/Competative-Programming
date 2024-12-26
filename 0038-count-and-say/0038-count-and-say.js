/**
 * @param {number} n
 * @return {string}
 */
var countAndSay = function(n) {
    var s='1'
    for(let k =0; k<n-1;k++){
        var sCopy=[]
        var i=0
        var j=0
        while (j<s.length){
            if(s[i]==s[j]){
                j++
            }
            else{
                sCopy=`${sCopy}${j-i}`
                sCopy=`${sCopy}${s[i]}`
                i=j
            }
        }
        sCopy=`${sCopy}${j-i}`
        sCopy=`${sCopy}${s[i]}`
        s=sCopy
        
    }
    return s
    
};