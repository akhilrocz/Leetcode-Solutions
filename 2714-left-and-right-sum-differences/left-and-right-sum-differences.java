class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        int[] result = new int[n];

        if (n == 1)
            return new int[]{0};

        leftSum[0] = 0;
        rightSum[n - 1] = 0;

        for (int i = 1; i < nums.length; i++) {
            leftSum[i]=nums[i-1]+leftSum[i-1];
        }

        for (int i = n - 2; i >= 0; i--) {
          rightSum[i]=nums[i+1]+rightSum[i+1];
        }

        for(int i=0;i<leftSum.length;i++){
           
                result[i]=Math.abs(leftSum[i]-rightSum[i]);
            
        }

        return result;

    }
}