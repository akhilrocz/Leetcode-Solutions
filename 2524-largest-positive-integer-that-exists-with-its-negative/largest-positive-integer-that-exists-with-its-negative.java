class Solution {
    public int findMaxK(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        int max = -1;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (key>0 && key > max && map.containsKey(-key)) {
                max = key;
            }
        }

        return max;

    }
}