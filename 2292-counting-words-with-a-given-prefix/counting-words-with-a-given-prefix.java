class Solution {
    public int prefixCount(String[] words, String pref) {

        int count = 0;
        int n = words.length;

        int prefLength = pref.length();

        for (String word : words) {
            if (isPrefix(word, prefLength, pref)) {
                count++;
            }
        }
        return count;
    }

    public boolean isPrefix(String word, int prefLength, String pref){
        if(word.length()<prefLength) return false;
        for(int i=0;i<pref.length();i++){
            if(word.charAt(i)!=pref.charAt(i)){
                return false;
            }
        }
        return true;
    }

}