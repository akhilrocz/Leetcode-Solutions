class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum=0;
        for(int num:nums){
            elementSum+=num;
        }
        int digitSum=0;
        for(int num:nums){
            while(num>0){
                int r =num%10;
                digitSum+=r;
                num=num/10;
            }
        }
        return Math.abs(elementSum-digitSum);
    }
}