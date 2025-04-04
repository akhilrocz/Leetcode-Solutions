class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {

        for (int x = 0; x < k; x++) {
            int n = nums.length;
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int i = 0; i < n; i++) {
                if (nums[i] < min) {
                    min = nums[i];
                    minIndex = i;
                }
            }

            if (minIndex != -1) {
                nums[minIndex] = min * multiplier;
            } else {
                break;
            }
        }

        return nums;
    }
}