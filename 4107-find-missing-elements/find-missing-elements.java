class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;

        int max = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;

        Set<Integer> set = new HashSet<>();

        List<Integer> result = new ArrayList<>();

        for(int num:nums){
           max = Math.max(max,num);
           min = Math.min(min,num);
           set.add(num);
        }

        for(int i=min;i<=max;i++){
            if(!set.contains(i)){
                result.add(i);
            }
        }

        return result;
    }
}