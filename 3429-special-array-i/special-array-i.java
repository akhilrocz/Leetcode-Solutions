class Solution {
    public boolean isArraySpecial(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        boolean correctPair = true;
        for (int i = 1; i < nums.length; i++) {

            // both odd or both even will fail
            if (nums[i] % 2 != 0 && nums[i - 1] % 2 != 0 || nums[i] % 2 == 0 && nums[i - 1] % 2 == 0) {
                correctPair = false;
                break;
            }
        }

        return correctPair;
    }
}