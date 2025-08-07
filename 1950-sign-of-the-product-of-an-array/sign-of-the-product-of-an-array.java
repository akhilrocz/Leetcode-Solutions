class Solution {
    public int arraySign(int[] nums) {
        int negativeCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                negativeCount++;
            } else if (nums[i] == 0) {
                zeroCount++;
            }
        }

        if (zeroCount == 0 && negativeCount % 2 != 0) {
            return -1;
        } else if (zeroCount == 0 && negativeCount % 2 == 0) {
            return 1;
        }
        return 0;

    }
}