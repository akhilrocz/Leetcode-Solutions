class Solution {
    public int singleNumber(int[] nums) {
       int xor=0;
       for(int num:nums){
        xor^=num;   // 0 0 1 0 xor 0 0 0 0  => 0 0 0 1 xor 0 0 1 0 => 0 0  1 1 xor  0 0 0 1
       }

       return xor;
    }
}