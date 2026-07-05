class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n = nums.length;
        int index=n/2;
        int middleElement = nums[n / 2];

        for(int i=0;i<n;i++){
            if(i!=index && nums[i]==middleElement){
                return false;
            }
        }

        //Map<Integer, Integer> map = new HashMap<>();

        // for (int num : nums) {
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        // }

        // for (int key : map.keySet()) {
        //     if (key == middleElement && map.get(middleElement) > 1) {
        //         return false;
        //     }
        // }

        return true;
    }
}