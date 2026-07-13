class Solution {
    public long sumAndMultiply(int n) {
        if (n == 0)
            return 0;
        long x = 0;
        String s = String.valueOf(n);
        long sum = 0;
        for (char c : s.toCharArray()) {
            int digit = c - '0';
            if (digit != 0) {
                x = x * 10 + digit; //1  //12 //123 1234
                sum += digit; //10
            }
        }

        return x * sum;

    }
}