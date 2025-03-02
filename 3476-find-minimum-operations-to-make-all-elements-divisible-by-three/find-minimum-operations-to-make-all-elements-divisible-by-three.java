class Solution {
    public int minimumOperations(int[] nums) {
       int minOperations=0;
       for(int i=0;i<nums.length;i++){
        if((nums[i]-1)%3==0 || (nums[i]+1)%3==0){
            minOperations++;
        }
       }

       return minOperations;
    }
}