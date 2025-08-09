class Solution {
    public int reverseBits(int n) {
        String binaryStr = String.format("%32s",Integer.toBinaryString(n)).replace(' ','0');

        String reversed = new StringBuilder(binaryStr).reverse().toString();


        return (int) Long.parseLong(reversed,2);
    }
}