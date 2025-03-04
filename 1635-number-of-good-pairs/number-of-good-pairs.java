class Solution { // Time Complexity =>0(n) space complexity => 0(n)
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            if (map.containsKey(num)) {
                count += map.get(num);
            }

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}