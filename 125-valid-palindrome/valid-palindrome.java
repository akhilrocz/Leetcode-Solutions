class Solution {
  public boolean isPalindrome(String s) {
    String resultString = "";
    for (char c : s.toCharArray()) {
      if (Character.isLetter(c) || Character.isDigit(c)) { // Check for alphanumeric characters
        resultString+=c; // Convert to uppercase for case-insensitivity
      }
    }
    resultString = resultString.toUpperCase();
    int left = 0;
    int right = resultString.length() - 1;

    while (left <= right) {
      if (resultString.charAt(left) != resultString.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }

    return true;
  }
}
