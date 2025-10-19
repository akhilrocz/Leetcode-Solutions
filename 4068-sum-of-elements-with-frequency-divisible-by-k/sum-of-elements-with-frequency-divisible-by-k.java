class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if ((entry.getValue()) % k == 0) {
                sum += entry.getKey()*entry.getValue();
            }
        }

        return sum;

    }
}