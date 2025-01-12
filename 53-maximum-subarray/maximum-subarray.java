//Time complexity => 0(n)
// Space Complexity =>0(1)
class Solution {
    public int maxSubArray(int[] nums) {
        int currMaxSum=0;
        int maxSoFar =Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            currMaxSum=Math.max(nums[i],currMaxSum+nums[i]);
            maxSoFar=Math.max(currMaxSum,maxSoFar);
        }
        return maxSoFar;
    }
}