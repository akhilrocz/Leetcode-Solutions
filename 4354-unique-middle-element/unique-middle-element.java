class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n =nums.length;
        int middleElement =nums[n/2];

        Map<Integer,Integer> map = new HashMap<>();

        for(int num:nums){
           map.put(num,map.getOrDefault(num,0)+1);
        }

       for(int key:map.keySet()){
        if(key ==middleElement && map.get(middleElement)>1){
            return false;
        }
       }

       return true;
    }
}