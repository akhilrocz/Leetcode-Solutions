//Time complexity => 0(n)
// Space Complexity =>0(1)
class Solution {
    public int maxSubArray(int[] nums) {
        int currSum=0;
        int maxSoFar =Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            currSum=Math.max(nums[i],currSum+nums[i]);
            maxSoFar=Math.max(currSum,maxSoFar);
        }
        return maxSoFar;
    }
}