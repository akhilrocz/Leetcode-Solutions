class Solution {
    public int repeatedNTimes(int[] nums) {
        int maxFrequency = 1;
        int length = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int n = length / 2;
        int uniqueElements = n + 1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                if(maxFrequency==n){
                    return entry.getKey();
                }
            }
        }

        return -1;
    }
}