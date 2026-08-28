class Solution {
    public String longestPalindrome(String s) {

        int n = s.length();

        int start = 0;

        int maxLength = 1;

        for (int i = 0; i < n; i++) {
            //odd palindrome

            int left = i;
            int right = i;

            while (left >= 0 && right < s.length() && s.charAt(right) == s.charAt(left)) {
                if (right - left + 1 > maxLength) {
                    maxLength = right - left + 1;
                    start = left;
                }

                left--;
                right++;
            }

            //even palindrome
            left = i;
            right = i + 1;

            while (left >= 0 && right < s.length() && s.charAt(right) == s.charAt(left)) {
                if (right - left + 1 > maxLength) {
                    maxLength = right - left + 1;
                    start = left;
                }
                left--;
                right++;
            }

        }

        return s.substring(start,start+maxLength);

    }
}