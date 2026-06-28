class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];
        int currentMaxSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            currentMaxSum = Math.max(nums[i], nums[i] + currentMaxSum);
            maxSum = Math.max(currentMaxSum, maxSum);
        }

        return maxSum;

    }
}