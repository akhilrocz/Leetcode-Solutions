class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int temp = nums[i];
            while (temp > 0) {
                int r = temp % 10; //2
                sum += r;
                temp /= 10;
            }

            if (sum == i) {
                return i;
            } else {
                continue;
            }
        }

        return -1;
    }
}