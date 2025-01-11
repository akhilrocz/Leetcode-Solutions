/**
 * @param {string[]} sentences
 * @return {number}
 */
var mostWordsFound = function(sentences) {
    let maxWords=0;
    for(let i=0;i<sentences.length;i++){
           sentences[i]=sentences[i].split(" ");
           let eachSentenceWordsCount = sentences[i].length;
           maxWords= Math.max(eachSentenceWordsCount,maxWords);
        }
        return maxWords;
        
};