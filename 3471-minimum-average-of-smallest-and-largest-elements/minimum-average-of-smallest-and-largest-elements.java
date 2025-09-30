class Solution {
    public double minimumAverage(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int left = 0;
        int right = n - 1;
        double[] res = new double[n / 2];
        int index = 0;
        double minAvg = Double.MAX_VALUE;
        while (left < right) {
            double average = (double) (nums[left] + nums[right]) / 2.0;
            res[index++] = average;
            left++;
            right--;
            //goes up to half of arr
        }

        for (double num : res) {
            if (num < minAvg) {
                minAvg = num;
            }
        }

        return minAvg;
    }
}