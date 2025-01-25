class Solution {
    public int findComplement(int num) {
        String binaryStr = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < binaryStr.length(); i++) {
            sb.append(binaryStr.charAt(i) == '0' ? '1' : '0');
        }
        return Integer.parseInt(sb.toString(), 2);
    }
}