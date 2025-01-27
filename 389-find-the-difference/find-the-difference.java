class Solution {
    public char findTheDifference(String s, String t) {
        int xor = 0;
        for (char c : s.toCharArray()) {
            xor ^= (int) c;
        }
        for (char x : t.toCharArray()) {
            xor ^= (int) x;
        }
        return (char) xor;
    }
}