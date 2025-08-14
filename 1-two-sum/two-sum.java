class Solution {
    public int[] twoSum(int[] nums, int target) {
        //brute force approach
    int[] res = new int[2];
      for(int i=0;i<nums.length-1;i++){
        int complement = target - nums[i];
        for(int j=i+1;j<nums.length;j++){
           if(complement == nums[j]){
            return new int[]{i,j};
           }
        }
      }


    
      return new int[-1];
    }
}