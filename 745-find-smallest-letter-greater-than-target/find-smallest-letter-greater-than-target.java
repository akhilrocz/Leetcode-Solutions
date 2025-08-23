class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        char smallestChar = letters[0];
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] > target) {
                smallestChar = letters[mid];
                right = mid - 1; //search left for even smaller
            } else {
                left = mid + 1; //if smaller serach right for smallest char lexicographically greater than target
            }
        }

        return smallestChar;
    }
}