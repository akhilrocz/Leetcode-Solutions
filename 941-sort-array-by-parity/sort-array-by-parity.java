class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n =nums.length;
        if(n==0) return nums;

        int[] result = new int[n];
        int index1=0;
        int index2=n-1;

        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                result[index1++]=nums[i];
            }else{
                result[index2--]=nums[i];
            }
        }

        return result;

    }
}