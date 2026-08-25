class Solution {
    public int missingMultiple(int[] nums, int k) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int count = 1;

        while (true) {

           int prod = count * k;

            if (!set.contains(prod)) {
                return prod;
            } else {
                count++;
            }
        }
    }
}