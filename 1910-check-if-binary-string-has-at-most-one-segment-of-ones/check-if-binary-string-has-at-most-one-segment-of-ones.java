class Solution {
    public boolean checkOnesSegment(String s) {

        int firstZeroIndex = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                firstZeroIndex = i;
                break;
            }
        }

        if (firstZeroIndex == -1) {
            return true;
        }

        for (int i = firstZeroIndex + 1; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                return false;
            }
        }

        return true;

    }
}