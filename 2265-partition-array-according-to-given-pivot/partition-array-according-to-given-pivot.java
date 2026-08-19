class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int less=0;
        int equal=0;
        int greater=0;

        int n =nums.length;

        int[] res = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                res[less]=nums[i];
                less++;
            }
        }

        equal=less;

        for(int i=0;i<n;i++){
            if(nums[i]==pivot){
                res[equal]=nums[i];
                equal++;
            }
        }

        greater=equal;

        for(int i=0;i<n;i++){
            if(nums[i]>pivot){
                res[greater]=nums[i];
                greater++;
            }
        }

        return res;

    }
}