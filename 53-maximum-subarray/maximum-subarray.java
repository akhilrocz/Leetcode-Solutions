//Time complexity => 0(n)
// Space Complexity =>0(1)
class Solution {
    public int maxSubArray(int[] nums) {
       int currentSum=0;
       int subArrayMaxSum = Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
        currentSum=Math.max(nums[i],currentSum+nums[i]);
        subArrayMaxSum=Math.max(currentSum,subArrayMaxSum);
       }
       return subArrayMaxSum;
    }
}