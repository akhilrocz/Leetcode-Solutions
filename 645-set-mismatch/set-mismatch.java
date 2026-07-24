class Solution {
    public int[] findErrorNums(int[] nums) {
       int n =nums.length;
       int duplicate=-1;
       int missing =-1;
       for(int i=0;i<n;i++){
        int num=Math.abs(nums[i]);
        int index =num-1; //1
        if(nums[index]<0){
            duplicate=num;
        }else{
            nums[index]=nums[index]*-1;
        }
       }

       for(int j=0;j<n;j++){
        if(nums[j]>0){
           missing =j+1;
           break;
        }
       }

       return new int[]{duplicate,missing};

    }
}