class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        List<Integer> res = new ArrayList<>();

        if (nums.length == 1 && nums[0] == 0 && nums[0] >= indexDifference && nums[0] >= valueDifference) {
            return new int[] { 0, 0 };
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j=i;j<nums.length;j++) {
                if (Math.abs(i - j) >= indexDifference && Math.abs(nums[i] - nums[j]) >= valueDifference) {
                    res.add(i);
                    res.add(j);
                }
            }
        }

        if (res.size() == 0) {
            return new int[] { -1, -1 };
        }

        int[] output = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            output[i] = res.get(i);
        }

        return output;

    }
}