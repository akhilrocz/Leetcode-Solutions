class Solution {
    public int lengthOfLastWord(String s) {
        String trimmedStr = s.trim();
        String[] words = trimmedStr.split(" ");
        return words[words.length - 1].length();
    }
}