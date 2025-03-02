
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] resultArr = new int[nums.length];
        int leftPtr = 0;
        int rightPtr = nums.length - 1;
        for (int i = nums.length-1;i>=0;i--) {
            if (nums[leftPtr] * nums[leftPtr] > nums[rightPtr] * nums[rightPtr]) {
                resultArr[i] = nums[leftPtr] * nums[leftPtr];
                leftPtr++;
            } else {
                resultArr[i] = nums[rightPtr] * nums[rightPtr];
                rightPtr--;
            }
        }

        return resultArr;

    }
}