class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int index=0;

        int[] res = new int[nums.length];

        int left=0;
        int right =nums.length-1;

        for(int i=0;i<nums.length;i++){
            if((nums[i]^1)==(nums[i]+1)){
                res[left++]=nums[i];
            }else{
                res[right--]=nums[i];
            }
        }

        return res;

    }
}