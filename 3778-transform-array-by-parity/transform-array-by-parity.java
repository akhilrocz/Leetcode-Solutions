class Solution {
    public int[] transformArray(int[] nums) {
        int[] res= new int[nums.length];
        int evenIndex=0;
        int oddIndex=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                res[evenIndex++]=0;
            }else{
                res[oddIndex--]=1;
            }
        }

        return res;

       
    }
}