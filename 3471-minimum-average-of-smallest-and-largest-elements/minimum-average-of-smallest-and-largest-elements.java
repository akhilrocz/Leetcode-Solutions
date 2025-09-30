class Solution {
    public double minimumAverage(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int left = 0;
        int right = n - 1;
        double minAvg = Double.MAX_VALUE;
        while (left < right) {
            double average = (double) (nums[left] + nums[right]) / 2.0;
            minAvg = Math.min(average, minAvg);
            left++;
            right--;
            //goes up to half of arr
        }

        return minAvg;
    }
}