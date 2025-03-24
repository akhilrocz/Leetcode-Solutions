class Solution {
    public int maxAdjacentDistance(int[] nums) {
        if (nums.length == 2) {
            return Math.abs(nums[1] - nums[0]);
        }

        int maxAbsoluteDiff = Integer.MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {
            maxAbsoluteDiff = Math.max(maxAbsoluteDiff, Math.abs(nums[i] - nums[i-1]));
        }

        if (Math.abs(nums[nums.length - 1] - nums[0]) > maxAbsoluteDiff) {
            return Math.abs(nums[nums.length - 1] - nums[0]);
        }

        return maxAbsoluteDiff;

    }
}