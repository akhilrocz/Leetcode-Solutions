class Solution {
    public void moveZeroes(int[] nums) {

        int index = 0;
        //first fill with non zero elements
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }

        //fill with zero elements at last

        while(index<nums.length){
            nums[index++] = 0;
        }

    }
}