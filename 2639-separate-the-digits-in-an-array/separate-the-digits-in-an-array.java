class Solution {
    public int[] separateDigits(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
           String s =String.valueOf(nums[i]);

           for(char c:s.toCharArray()){
            list.add(c-'0');
           }
            
        }

        int[] res = new int[list.size()];

        for(int j=0;j<list.size();j++){
            res[j]=list.get(j);
        }

        return res;
    }
}