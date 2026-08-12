class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left=0;
        int right =1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                result[left]=nums[i];
                left+=2;
            }else{
                result[right]=nums[i];
                right+=2;
            }
        }

        return result;

    }
}