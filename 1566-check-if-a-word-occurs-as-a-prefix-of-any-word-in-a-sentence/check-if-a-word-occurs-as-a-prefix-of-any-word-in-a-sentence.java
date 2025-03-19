class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
    int index=-1;
    String[] trimmedSentence = sentence.split(" ");
    for(int i=0;i<trimmedSentence.length;i++){
        if(trimmedSentence[i].startsWith(searchWord)){
            return i+1;
        }
    }

    return -1;


    }
}