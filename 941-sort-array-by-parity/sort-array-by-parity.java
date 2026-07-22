class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int index=0;
        int index1=nums.length-1;

        int result[] = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                result[index++]=nums[i];
            }else{
                result[index1--]=nums[i];
            }
        }

        return result;
    }
}