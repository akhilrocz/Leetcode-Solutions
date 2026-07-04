class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxLength=Integer.MIN_VALUE;
        for(String sentence:sentences){
            String[] words = sentence.trim().split(" ");
            int length =words.length;
            if(length>maxLength){
                maxLength=length;
            }
        }

        return maxLength;
    }
}