class Solution {
    public int countKDifference(int[] nums, int k) {
        //brute force approach
        // int n =nums.length;
        // int count=0;
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(Math.abs(nums[i]-nums[j])==k){
        //             count++;
        //         }
        //     }
        // }

        // return count;

        Map<Integer,Integer> map = new HashMap<>();

        int count=0;

        for(int i=0;i<nums.length;i++){
            
            if(map.containsKey(nums[i]-k)) {
                count=count+map.get(nums[i]-k);
            }

               if(map.containsKey(nums[i]+k)) {
                count=count+map.get(nums[i]+k);
            }

            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }

        return count;

    }
}