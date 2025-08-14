class Solution {
    public int[] twoSum(int[] nums, int target) {
        //brute force approach
        // for (int i = 0; i < nums.length - 1; i++) {
        //     int complement = target - nums[i];
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (complement == nums[j]) {
        //             return new int[] { i, j };
        //         }
        //     }
        // }

        // return new int[0];

        //optimized version => HashMaps

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int complement = target-nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }

            map.put(nums[i],i);
        }


        return null;






    }
}