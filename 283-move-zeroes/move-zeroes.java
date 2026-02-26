class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
       // if(n==0 && nums[0]==0) return new int[0];
        // int zerosArr=[];
        int index=0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[index++]=nums[i];
            }
        }

        while(index<n){
            nums[index]=0;
            index++;
        }

    }
}