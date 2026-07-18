class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res=new int[n<<1];

        for(int i=0, resultIndex=0;i<n;i++){
            res[resultIndex++]=nums[i]; //2
            res[resultIndex++]=nums[i+n]; //3
        }

        return res;
    }
}