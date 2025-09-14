class Solution {
    public int[] getNoZeroIntegers(int n) {
        //int[] res = new int[2];
        for (int left = 1; left < n; left++) {
            int right = n - left;
            if (!String.valueOf(left).contains("0") && !String.valueOf(right).contains("0")) {
                return new int[] { left, right };
            }
        }

        return new int[] { -1, -1 };
    }
}