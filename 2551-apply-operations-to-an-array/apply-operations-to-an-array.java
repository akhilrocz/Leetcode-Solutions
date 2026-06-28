class Solution {
    public int[] applyOperations(int[] nums) {
        int n =nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]!=nums[i+1]){
                continue;
            }else if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }

        int[] res = new int[n];
       // boolean nonZero=true;
       int index=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                res[index++]=nums[i];
            }
        }

        return res;
    }
}