class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = num;
            } else if (max > num && num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (secondMax > num && num > thirdMax) {
                thirdMax = num;
            }
        }
        return thirdMax == Long.MIN_VALUE ? (int) max : (int) thirdMax;
    }
}