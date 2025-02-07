class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int actualSum = n * (n + 1) / 2;
        int expectedSum = 0;
        for (int i = 0; i < nums.length; i++) {
            expectedSum += nums[i];
        }

        Set<Integer> set = new HashSet<>();
        int duplicate = 0;
        for (int num : nums) {
            if (!set.add(num)) {
                duplicate = num;
            }
        }

        int missingNum = actualSum - (expectedSum - duplicate);

        return new int[] { duplicate, missingNum };

    }
}