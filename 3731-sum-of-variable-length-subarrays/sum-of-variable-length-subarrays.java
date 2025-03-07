class Solution {
    public int subarraySum(int[] nums) {
        int n =nums.length;
        int totalSum=0;
        for(int i=0;i<n;i++){
            int start = Math.max(0, i - nums[i]);
            int subArraySum=0;
            for(int j=start;j<=i;j++){
                subArraySum+=nums[j];
            }
            totalSum+=subArraySum;
        }
        return totalSum;
    }
}