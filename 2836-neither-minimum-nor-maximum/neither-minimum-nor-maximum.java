class Solution {
    public int findNonMinOrMax(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        for (int num : nums) {
            if (num != max && num != min) {
                return num;
            }
        }
        return -1;

    }
}