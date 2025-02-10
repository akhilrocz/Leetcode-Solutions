/**
 * @param {string} s
 * @return {number}
 */
var countSegments = function (s) {
    if(!s){
        return 0;
    }
    let str=s.trim();
    let segments = str.split(/\s+/);

    if(segments.length===1 && segments[0]===""){
        return 0;
    }

    return segments.length;
};