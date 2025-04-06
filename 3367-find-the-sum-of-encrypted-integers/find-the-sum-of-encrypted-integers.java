class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int maxDigit = 0;
            int temp = nums[i];

            while (temp > 0) {
                int digit = temp % 10;  //get each digit
                maxDigit = Math.max(maxDigit, digit);
                temp /= 10;
            }

            int encrypted = 0;
            int len = String.valueOf(nums[i]).length();
            for (int j = 0; j < len; j++) {
                encrypted = encrypted * 10 + maxDigit;
            }

            sum += encrypted;
        }

        return sum;

    }
}