class Solution {
    public int maximizeSum(int[] nums, int k) {
        int maxSum=0;
        int maxNum = Integer.MIN_VALUE;
        while(k-->0){
            for(int num:nums){
                if(num>maxNum){
                    maxNum =num;   //6
                }
            }

            maxSum+=maxNum; //5  //5+6

            int n =maxNum+1; //6 //7

            nums[nums.length-1]=n; //6  //7
        }


        return maxSum;
    }
}