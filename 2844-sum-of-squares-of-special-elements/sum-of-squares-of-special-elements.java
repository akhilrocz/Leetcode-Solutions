class Solution {
    public int sumOfSquares(int[] nums) {
        int sumofSquares = 0;
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for (int i=1;i<=n;i++) {
            if (n%i == 0) {
              list.add(nums[i-1]*nums[i-1]);
            }
        }

        for(int x=0;x<list.size();x++){
            sumofSquares+=list.get(x);
        }

        return sumofSquares;
    }
}