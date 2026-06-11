class Solution {
    public int lengthOfLastWord(String s) {
        String trimmed =s.trim();
        String[] words = trimmed.split(" ");
        String word =words[words.length-1];
        return word.length();
    }
}