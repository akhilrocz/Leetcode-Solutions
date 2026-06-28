class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int currentMaxSum = 0;
        int maxSum = Integer.MIN_VALUE;
        if (n == 1)
            return nums[0];
        for (int i = 0; i < n; i++) {
            currentMaxSum = Math.max(nums[i], currentMaxSum + nums[i]);
            maxSum = Math.max(currentMaxSum, maxSum);
        }

        return maxSum;
    }
}