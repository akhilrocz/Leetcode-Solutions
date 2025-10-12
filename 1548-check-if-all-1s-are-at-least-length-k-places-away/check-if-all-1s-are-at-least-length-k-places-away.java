class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        List<Integer> indices = new ArrayList<>();
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                indices.add(i);
            }
        }

        //1 0 0 1 0 1

        for (int j = 0; j < indices.size()-1; j++) {
            if ( (Math.abs(indices.get(j) - indices.get(j + 1)) -1) < k) {
                return false;
            }
        }
        return true;

    }
}