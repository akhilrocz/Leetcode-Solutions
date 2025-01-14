class Solution {
    public int averageValue(int[] nums) {
        int total = 0;
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0 && nums[i] % 3 == 0) {
                total += nums[i];
                cnt++;
            }
        }
        return cnt>0?(total / cnt):0;
    }
}