class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

       List<Integer> l =new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
              if (entry.getValue() == 2) {
                l.add(entry.getKey());
            }
        }

        int xor = 0;
        for (int x : l) {
            xor ^= x;
        }

        return xor;

    }
}