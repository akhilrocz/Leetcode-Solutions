class Solution {
    public int[] twoSum(int[] nums, int target) {
        //brute force approach
        List<Integer> list = new ArrayList<>();
        int[] res = new int[2];
        int index=0;
      for(int i=0;i<nums.length-1;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
               list.add(i);
               list.add(j);
            }
        }
      }


      for(int p=0;p<list.size();p++){
        res[p] = list.get(p);
      }

      return res;
    }
}