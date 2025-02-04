class Solution {
    public int alternateDigitSum(int n) {

        int answer = 0;
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
            int digit = Character.getNumericValue(s.charAt(i));
            if (i % 2 == 0) {
                answer += digit;
            } else {
                answer -= digit;
            }
        }

        return answer;
    }
}