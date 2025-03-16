class Solution {
    public int prefixCount(String[] words, String pref) {
        int prefLength = pref.length();
        int n = words.length;
        int count = 0;

        for (String word : words) {
            if (isPrefix(word, prefLength, pref)) {
                count++;
            }
        }

        return count;
    }

    public boolean isPrefix(String word, int prefLength, String pref) {
        if (word.length() < pref.length())
            return false;
        for (int i = 0; i < prefLength; i++) {
            if (word.charAt(i) != pref.charAt(i)) {
                return false;
            }
        }

        return true;
    }

}