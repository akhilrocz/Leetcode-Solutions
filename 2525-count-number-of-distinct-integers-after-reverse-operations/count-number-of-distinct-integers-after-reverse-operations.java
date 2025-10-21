class Solution {
    public int countDistinctIntegers(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        // in place operations
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int temp = num;
            StringBuilder sb = new StringBuilder(); //reset
            while (temp > 0) {
                int r = temp % 10; //1
                String s = String.valueOf(r); // "1"
                sb.append(s);
                temp /= 10;
            }
            set.add(Integer.parseInt(sb.toString()));
        }

        return set.size();
    }
}