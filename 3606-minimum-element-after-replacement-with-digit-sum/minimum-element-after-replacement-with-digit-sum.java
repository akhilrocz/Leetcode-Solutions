class Solution {
    public int minElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
               int sum=0;
            int temp=nums[i];
            while(temp>0){
                int r = temp%10;  //2 //1
                sum+=r;  //2  //3
                temp/=10;  //1
            }

            nums[i]=sum;
        }

        int min=Integer.MAX_VALUE;
        for(int num:nums){
            if(num<min){
                min=num;
            }
        }

        return min;
    }
}