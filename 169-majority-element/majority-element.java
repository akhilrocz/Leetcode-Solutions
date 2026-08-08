class Solution {
    public int majorityElement(int[] nums) {
        //Boyer-Moore voting algorithm

        int candidate = -1;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num; //3
                count = 1; //1
            } else if (candidate==num) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}