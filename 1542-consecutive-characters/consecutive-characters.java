class Solution {
    public int maxPower(String s) {
        int maxLength = 1;
        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {
           count = s.charAt(i)==s.charAt(i+1)?count+1:1;
           maxLength=Math.max(maxLength,count);
        }
        return maxLength;
    }
}