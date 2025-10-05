class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int bitwiseOr=0;
        for(int num:nums){
            if(num%2==0){
                bitwiseOr = bitwiseOr | num;
            }
        }

        return bitwiseOr;
    }
}