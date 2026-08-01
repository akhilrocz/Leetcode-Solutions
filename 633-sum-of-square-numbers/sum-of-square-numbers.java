class Solution {
    public boolean judgeSquareSum(int c) {
        long a = 0;
        long b = (long) Math.sqrt(c);

        while (a <= b) {
            long sumOfsquares = (long) (a * a) + (b * b);

            if (sumOfsquares == (long) c) {
                return true;
            } else if (sumOfsquares < c) {
                a++;
            } else {
                b--;
            }
        }

        return false;
    }
}