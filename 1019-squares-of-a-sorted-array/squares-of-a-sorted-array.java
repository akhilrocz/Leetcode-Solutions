
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] resultArr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
        resultArr[i]=Math.abs(nums[i]);
        }

        Arrays.sort(resultArr);

        for(int i=0;i<resultArr.length;i++){
            resultArr[i]=resultArr[i]*resultArr[i];
        }

        return resultArr;
    }
}