class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // Time complexity => 0(n)logn

        // List<Integer> result = new ArrayList<>();
        // Arrays.sort(nums);

        // for (int i = 0; i < nums.length; i++) {
        // if (nums[i] == target) {
        // result.add(i);
        // }
        // }

        // return result;

        List<Integer> result = new ArrayList<>();
        int lessThanTarget = 0;
        int equalTotarget = 0;
        for (int num : nums) {
            if (num < target) {
                lessThanTarget++;
            } else if(num==target) {
                equalTotarget++;
            }
        }

        for (int i = 0; i < equalTotarget; i++) {
            result.add(i + lessThanTarget);
        }

        return result;

    }
}