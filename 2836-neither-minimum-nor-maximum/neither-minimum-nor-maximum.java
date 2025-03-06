class Solution {
    public int findNonMinOrMax(int[] nums) {

        int maximumNUm = Integer.MIN_VALUE;
        int minimumNum = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maximumNUm) {
                maximumNUm = nums[i];
            }
        }
        for(int num:nums){
            if(num<minimumNum)
            {
                minimumNum = num;
            }
        }

        for (int num : nums) {
            if (num != maximumNUm && num != minimumNum) {
                return num;
            }
        }

        return -1;

    }
}