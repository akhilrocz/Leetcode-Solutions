class Solution {
    public int smallestEqual(int[] nums) {
        int smallestIndex = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (i % 10 == nums[i] && i < smallestIndex) {
                return i;
            }
        }

        return -1;
    }
}