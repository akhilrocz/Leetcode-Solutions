class Solution {
    public int[] evenOddBit(int n) {
        String s = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            sb.append(c);
        }

        sb.reverse();
        int even = 0;
        int odd = 0;
        for (int i =0;i<sb.length();i++) {
            if (i % 2 == 0 && sb.charAt(i) == '1') {
                even++;
            } else if (i % 2 == 1 && sb.charAt(i) == '1') {
                odd++;
            }
        }

        return new int[] { even,odd };
    }
}