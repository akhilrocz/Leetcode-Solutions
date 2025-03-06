class Solution {
    public int findNonMinOrMax(int[] nums) {
        if (nums.length < 3)
            return -1;
        int min = Math.min(nums[0], Math.min(nums[1], nums[2]));
        int max = Math.max(nums[0], Math.max(nums[1], nums[2]));
        for (int num : nums) {
            if (num != min && num != max) {
                return num;
            }
        }
        return -1;

    }
}