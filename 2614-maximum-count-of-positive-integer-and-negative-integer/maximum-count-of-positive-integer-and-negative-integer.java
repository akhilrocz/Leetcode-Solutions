class Solution {
    public int maximumCount(int[] nums) {
        int positiveNumsCount = 0;
        int negativeNumsCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                positiveNumsCount++;
            } else if (nums[i] < 0) {
                negativeNumsCount++;
            }
        }

        return Math.max(positiveNumsCount, negativeNumsCount);
    }
}