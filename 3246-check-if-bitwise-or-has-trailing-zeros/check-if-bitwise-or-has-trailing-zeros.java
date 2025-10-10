class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            String s = Integer.toBinaryString(nums[i]);
            int len =s.length();
            if (s.charAt(len - 1) == '0') {
                count++;
            }
        }

        return count >= 2;
    }
}