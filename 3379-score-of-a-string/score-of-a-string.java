class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        if (s.length() == 0) return 0; // Handle empty string case
        for (int i = 0; i < s.length()-1; i++) {
            char currentChar = s.charAt(i);
            char nextChar = s.charAt(i + 1);
            score += Math.abs((int)currentChar - (int)nextChar); // Use Math.abs for absolute difference
        }      
        return score;
    }
}
